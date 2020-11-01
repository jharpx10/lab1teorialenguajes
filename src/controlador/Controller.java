/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.View;

/**
 *
 * @author Alejandro Rios
 */
public class Controller implements ActionListener {

    static Controller instance;
    static View vista;

    public static void start() {
        getInstance();
        ViewManager.getInstance().start(instance);
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "ABOUT":
                ViewManager.getInstance().setVisibleAbout(instance);
                break;
            case "CLOSE":
                System.exit(0);
                break;
            case "REVIEW":
                ViewManager.getInstance().setVisibleReview(instance);

                break;
            case "NEW":
                ViewManager.getInstance().clearReviewCodeView();
                break;
            case "TEST":
                ViewManager.getInstance().setEnableCodeButton(false);
                handleTest();
                break;
            case "SELECT":

                break;
            case "START":
                ViewManager.getInstance().setVisibleStart(instance);
                break;

        }

    }

    void recibirRespuestaModelo(String respuesta) {
        ViewManager.getInstance().writeResponse(respuesta);
    }

    private void handleTest() {
        ModelManager.getInstance().
                processCode(InfraestructureManager.getInstance().
                        getStringFromFile(
                                ViewManager.getInstance().
                                        getWrotePath()));
    }

}
