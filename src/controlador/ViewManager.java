/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.AboutView;
import vista.View;
import vista.InitialView;
import vista.ReviewCodeView;

/**
 *
 * @author Alejandro Rios
 */
public class ViewManager {

    static ViewManager instance;
    static View vista;

    public static ViewManager getInstance() {
        if (instance == null) {
            instance = new ViewManager();
        }
        return instance;
    }

    public void start(Controller controlador) {
        vista = InitialView.getInstance(controlador);
        setVisibleView();
    }

    private static void setVisibleView() {
        vista.setVisible(true);
    }

    private static void setInvisibleView() {
        vista.setVisible(false);
    }

    public void setVisibleStart(Controller controlador) {
        setInvisibleView();
        vista = InitialView.getInstance(controlador);
        setVisibleView();
    }

    public String getWrotePath() {
        ReviewCodeView v = (ReviewCodeView) vista;
        return v.getPathText().getText();
    }

    public void setVisibleReview(Controller controlador) {
        setInvisibleView();
        vista = ReviewCodeView.getInstance(controlador);
        setVisibleView();
    }

    void writeResponse(String response) {
        ReviewCodeView v = (ReviewCodeView) vista;
        v.getResponseText().setText(v.getResponseText().getText() + response);
    }

    void  setEnableCodeButton(boolean enable) {
        ReviewCodeView v = (ReviewCodeView) vista;
        v.getTestCodeButton().setEnabled(enable);
    }
   

    void clearReviewCodeView() {
        ReviewCodeView v = (ReviewCodeView) vista;
        v.getResponseText().setText("");
        v.getTestCodeButton().setEnabled(true);
        v.getPathText().setText("");
    }

    void setVisibleAbout(Controller controller) {
    setInvisibleView();
        vista = AboutView.getInstance(controller);
        setVisibleView();
    }
}
