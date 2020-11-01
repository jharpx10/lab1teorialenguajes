/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infraestructuraJava;

import controlador.InfraestructureManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro Rios
 */
public class LocalStringFileReader implements IFileReader {

    @Override
    public ArrayList<String> read(Object target) {
        BufferedReader reader;
        ArrayList<String> stringRead = new ArrayList<>();
       
        try {
             
            reader = new BufferedReader(new FileReader((String) target));
            String nextRead=reader.readLine();
            while (nextRead!= null) {
                stringRead.add(nextRead);
                nextRead=reader.readLine();
            }
        } catch (FileNotFoundException ex) {
          InfraestructureManager.sendErrorMessage("¡ARCHIVO NO ENCONTRADO, POR FAVOR REVISE LA RUTA!");
        } catch (IOException ex) {
          InfraestructureManager.sendErrorMessage("¡ARCHIVO NO ENCONTRADO O CON EXTENSIÓN INCORRECTA!");
         
        }
       
      
        return stringRead;
    }

}
