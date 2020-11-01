/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import infraestructuraJava.LocalStringFileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Rios
 */
public class InfraestructureManager {

    static LocalStringFileReader reader;
    static InfraestructureManager instance;

    public static InfraestructureManager getInstance() {
        if (instance == null) {
            reader=new LocalStringFileReader();
            instance = new InfraestructureManager();
        }
        return instance;
    }
    
    public ArrayList<String> getStringFromFile(String path)
    {
    return reader.read(path);
    }
    
    public static void sendErrorMessage(String message){
    
        JOptionPane.showMessageDialog(null, message);
    }
    
}
