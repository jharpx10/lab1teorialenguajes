/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Automata;
import java.util.ArrayList;

/**
 *
 * @author Alejandro Rios
 */
public class ModelManager {

    static ModelManager instance;

    public static ModelManager getInstance() {
        if (instance == null) {
            instance = new ModelManager();
        }
        return instance;
    }

    public void processCode(ArrayList<String> code) {
        boolean correct = true;
        for (int i = 0; i < code.size(); i++) {
            String result = Automata.automata(code.get(i), i + 1);
            
            if (!result.equals("")) {

                enviarRespuesta(result);
                correct = false;
            }
        }
     
        if (correct && !code.isEmpty()) {
       enviarRespuesta("\n¡Felicidades el código está bien estrucurado!");
        } else {
       enviarRespuesta("\n¡Fin de evaluación se encontraron algunos errores :(!");
        }
    }

    private void enviarRespuesta(String respuesta) {
        Controller.getInstance().recibirRespuestaModelo(respuesta);
    }

    public void enviarLista(String printList, int n) {
  enviarRespuesta("\n LSL CREADA DE LÍNEA: "+n+":"+printList+"\n");
    }
}
