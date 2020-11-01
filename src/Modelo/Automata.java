/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.ModelManager;
import java.util.Locale;

/**
 *
 * @author Alejandro Rios
 */
public class Automata {

    public static String automata(String secuencia, int linea) {
        
        String estadoActual = "EI";
        String estadoActualIgual = "EI";
        Nodo c = null;
        int n = 0;
        String mensaje = "";
        String mensajeIgual = "";
        secuencia += " ";
        String estadoPrevioError = "";
        
        
        for (char a : secuencia.toCharArray()) {
          
            estadoPrevioError = estadoActual;
            c = listar(c, estadoActual, a);

            n++;
            if (estadoActual.equals("EI")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "I";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "T";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "F";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "L";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "B";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "C";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EI";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("I")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "N";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("N")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "R";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("L")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "O";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("O")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "N2";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("N2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "R";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("F")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "L2";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("L2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "O2";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("O2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "A";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("A")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "R";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("B")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "O3";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("O3")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "O4";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("O4")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "L3";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("L3")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "E";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("E")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "A2";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("A2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "R";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("C")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "H";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("H")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "A3";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("A3")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "R";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("T")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "R3";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("R3")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "U";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("U")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "E3";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("E3")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("R")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("EPLNDD")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "I2";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "T2";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "F2";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "L4";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "B2";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "C2";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("LDD")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("LDA")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("NDD")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("NDA")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDA";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("I2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "N4";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("N4")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "R2";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("T2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "R4";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("R4")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "U2";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("U2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "R2";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("L4")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "O5";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("O5")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "N5";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("N5")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "R2";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("F2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "L5";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("L5")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "O6";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("O6")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "A4";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("A4")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "R2";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("B2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "O7";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("O7")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "O8";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("O8")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "L6";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("L6")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "E2";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("E2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "A5";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("A5")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "R2";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("C2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "H2";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("H2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "A6";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("A6")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "R2";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("R2")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDD";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDD";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDD";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "NDD";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("+")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "ERROR";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "EP++--";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("-")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "ERROR";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "EP++--";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("EP++--")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "ERROR";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EP++--";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("EPOLNDD")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "ERROR";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDD";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ACEPTE";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDD";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "EPLNDD";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("EPOLNDA")) {
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "ERROR";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EPOLNDA";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "SIDDAA";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "-";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "+";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("SIDDAA")) {

                ModelMessagePackage pack = AutomataIguales.Automata(a, secuencia, n, linea, estadoActualIgual, c);
                estadoActualIgual = pack.getMensaje()[0];
                mensajeIgual = pack.getMensaje()[1];
                c = pack.getC();
                if (estadoActualIgual.equalsIgnoreCase("ERROR")
                        || estadoActualIgual.equalsIgnoreCase("ERRORC")) {
                    estadoActual = estadoActualIgual;
                    estadoActualIgual = "EI";
                } else if (estadoActualIgual.equalsIgnoreCase("ACEPTE")) {
                    estadoActual = "ACEPTE";
                    estadoActualIgual = "EI";
                }

            } else if (estadoActual.equals("SIDDD")) {
                String estadoActualIgualPrevo = estadoActualIgual;
                ModelMessagePackage pack = AutomataIguales.Automata(a, secuencia, n, linea, estadoActualIgual, c);
                estadoActualIgual = pack.getMensaje()[0];
                mensajeIgual = pack.getMensaje()[1];
                c = pack.getC();

                if (estadoActualIgual.equalsIgnoreCase("ERROR")
                        || estadoActualIgual.equalsIgnoreCase("ERRORC")) {

                    estadoActual = estadoActualIgual;
                    if (estadoActualIgual.equalsIgnoreCase("ERROR") && a == ',') {

                        switch (estadoActualIgualPrevo) {
                            case "EVAR":
                            case "VAR":
                            case "VARN":
                            case "I":
                            case "N":
                            case "L":
                            case "O":
                            case "N2":
                            case "F":
                            case "L2":
                            case "O2":
                            case "A":
                            case "B":
                            case "O3":
                            case "O4":
                            case "L3":
                            case "E":
                            case "A2":
                            case "C":
                            case "H":
                            case "A3":

                                mensajeIgual = "";
                                estadoActual = "EPLNDD";
                                estadoActualIgual = "EI";
                                break;

                        }

                    } else {
                        estadoActualIgual = "EI";
                    }

                } else if (estadoActualIgual.equalsIgnoreCase("ACEPTE")) {
                    estadoActual = "ACEPTE";
                    estadoActualIgual = "EI";

                }

            } else if (estadoActual.equals("ERROR")) {
                c = null;
                
                  if (String.valueOf(a).equals(";")) {
                    estadoActual = "EI";
                } else {
                    estadoActual = "ERRORE";
                }
        
            } else if (estadoActual.equals("ERRORC")) {
                c = null;
                if (String.valueOf(a).equals("i")) {
                    estadoActual = "I";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "T";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "F";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "L";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "B";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "C";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EI";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            } else if (estadoActual.equals("ERRORE")) {
                c = null;
                if (String.valueOf(a).equals(";")) {
                    estadoActual = "EI";
                }  else {
                    estadoActual = "ERRORE";
                }
            } else if (estadoActual.equals("ACEPTE")) {

                if (String.valueOf(a).equals("i")) {
                    estadoActual = "I";
                } else if (String.valueOf(a).equals("n")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("t")) {
                    estadoActual = "T";
                } else if (String.valueOf(a).equals("f")) {
                    estadoActual = "F";
                } else if (String.valueOf(a).equals("l")) {
                    estadoActual = "L";
                } else if (String.valueOf(a).equals("o")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("a")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("g")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("b")) {
                    estadoActual = "B";
                } else if (String.valueOf(a).equals("e")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("c")) {
                    estadoActual = "C";
                } else if (String.valueOf(a).equals("h")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("r")) {
                    estadoActual = "LDA";
                } else if (String.valueOf(a).equals("u")) {
                    estadoActual = "LDA";
                } else if (isLetter(String.valueOf(a))) {
                    estadoActual = "LDA";
                } else if (isNumber(String.valueOf(a))) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(" ")) {
                    estadoActual = "EI";
                } else if (String.valueOf(a).equals(";")) {
                    estadoActual = "ERRORC";
                } else if (String.valueOf(a).equals("=")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("-")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals("+")) {
                    estadoActual = "ERROR";
                } else if (String.valueOf(a).equals(",")) {
                    estadoActual = "ERROR";
                } else {
                    estadoActual = "ERROR";
                }
            }
            if (estadoActual.equalsIgnoreCase("ERROR") || estadoActual.equalsIgnoreCase("ERRORC")) {
                mensaje += "\n" + getErrorMistake(estadoPrevioError, String.valueOf(a), linea, n, secuencia) + mensajeIgual;
                mensajeIgual = "";
            }
            if (estadoActual.equalsIgnoreCase("ACEPTE")) {
                ModelManager.getInstance().enviarLista(Nodo.printList(c), linea);
                c = null;
            }

        }

        return mensaje;
    }

    public static String getStringEspacioSelectError(int pos) {

        String s = "";
        for (int i = 1; i < pos; i++) {
            s += "-";
        }
        s += "^";
        return s;
    }

    public static String getErrorMistake(String estadoE, String entr, int linea, int posicion, String secuencia) {
        String err = "\n ERROR EN LÍNEA: " + linea + " POSICIÓN: " + posicion + "\n";

        String estadoDeError = estadoE;
        String entrada = entr;
        String selectError = getStringEspacioSelectError(posicion);
        switch (estadoDeError) {
            case "EI":
                err += "Se espera una letra para definir y/o asignar variable  e ingresó: " + entrada + "\n";
                break;
            case "I":
            case "N":
            case "L":
            case "O":
            case "N2":
            case "F":
            case "L2":
            case "O2":
            case "A":
            case "B":
            case "O3":
            case "O4":
            case "L3":
            case "E":
            case "A2":
            case "C":
            case "H":
            case "A3":
            case "LDA":
            case "NDA":
            case "EPOLNDA":

                err += "Se espera que asigne valor a variable";

                break;
            case "R":
            case "E3":
            case "EPLNDD":
                switch (entrada) {
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                    case "0":
                        err += "Nombre de varible no puede empezar con números";

                        break;
                    default:
                        err += "Palabra reservada no puede ser variable y además, se espera que se asigne valor a variable";

                        break;

                }

                break;
            case "LDD":
            case "EPOLNDD":
            case "NDD":
            case "I2":
            case "N4":
            case "L4":
            case "O5":
            case "N5":
            case "F2":
            case "L5":
            case "O6":
            case "A4":
            case "B2":
            case "O7":
            case "O8":
            case "L6":
            case "E2":
            case "A5":
            case "C2":
            case "H2":
            case "A6":

                err += "Al definir variable no se admite valor: " + entrada;
                break;
            case "R2":
                err += "Palabra reservada no puede ser variable";

                break;
            case "+":
            case "-":
                err += estadoDeError + " antes de '='. Es válido solo si luego sigue '=' o " + estadoDeError
                        + "\n Ingresó: " + entrada;
                break;
            case "EP++--":
                err += "Uso inadecuado de operador ++ o -- , se espera ';'";
                break;

        }
        err += "\n" + secuencia;
        err += "\n" + selectError;

        return err;
    }

    private static Nodo listar(Nodo c, String estadoActual, char a) {

        if (estadoActual.equalsIgnoreCase("SIDDAA") || estadoActual.equalsIgnoreCase("SIDDD")) {
            return c;
        }
        if((estadoActual.equalsIgnoreCase("+") || estadoActual.equalsIgnoreCase("-")) && 
                a == '=' ){
          Nodo edt = Nodo.getLastChildFrom(c);
            edt.setLiga(new Nodo("OPDOR",estadoActual));
        }
        
        if (a == '=') {
            Nodo edt = Nodo.getLastChildFrom(c);
            edt.setLiga(new Nodo("OPDOR", "="));
 

        }

        switch (estadoActual) {

            case "EI":
            case "ACEPTE":

                if (isLetter(String.valueOf(a)) || isNumber(String.valueOf(a))) {
                    Nodo edt;
                    if (c == null) {
                        c = new Nodo();
                        edt = c;
                    } else {
                        edt = Nodo.getLastChildFrom(c);
                        edt.setLiga(new Nodo());
                        edt = edt.getLiga();
                    }

                    edt.setTipo("VARIABLE");
                    edt.setValor(String.valueOf(a));

                }

                break;
            case "I":
            case "L":
            case "F":
            case "B":
            case "C":
            case "O":
            case "L2":
            case "O2":
            case "O3":
            case "O4":
            case "L3":
            case "E":
            case "H":
            case "T":
            case "R3":
            case "U":
            case "E3":
                if (isNumber(String.valueOf(a)) || isLetter(String.valueOf(a))) {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setValor(edt.getValor() + a);
                }
                break;

            case "N":
            case "N2":
            case "A":
            case "A2":
            case "A3":

                if (a == 't' || a == 'g' || a == 'n' || a == 'r') {
                    String tipo = "";
                    Nodo edit;
                    if (c == null) {
                        c = new Nodo();
                        edit = c;
                    } else {
                        edit = Nodo.getLastChildFrom(c);

                    }
                    if (estadoActual.equals("N") && a == 't') {
                        tipo = "int";
                    } else if (estadoActual.equals("N2") && a == 'g') {
                        tipo = "long";
                    } else if (estadoActual.equals("A") && a == 't') {
                        tipo = "float";
                    } else if (estadoActual.equals("A2") && a == 'n') {
                        tipo = "boolean";
                    } else if (estadoActual.equals("A3") && a == 'r') {
                        tipo = "char";
                    }
                    edit.setTipo("TIPO");
                    edit.setValor(tipo);
                }
                break;
                    case "+":
                    case "-":
                        if(String.valueOf(a).equals("+")||String.valueOf(a).equals("+")){
                        Nodo.getLastChildFrom(c).setLiga(new Nodo("OPDOR", String.valueOf(a)+String.valueOf(a)));
                        }
                        
                        
                        break;
            case "R":
                String va = String.valueOf(a);
                if (isNumber(va) || isLetter(va)) {
                    Nodo lastChild = Nodo.getLastChildFrom(c);
                    lastChild.setTipo("VAR");

                    lastChild.setValor(lastChild.getValor().toLowerCase(Locale.ITALY) + va);
                }
                break;
            case "EPLNDD":
                if (isLetter(String.valueOf(a))) {
                    Nodo.getLastChildFrom(c).setLiga(new Nodo("VAR", String.valueOf(a)));
                }
                break;
            case "LDD":
            case "LDA":
            case "NDA":
            case "NDD":
            case "I2":
            case "L4":
            case "N4":
            case "O5":
            case "N5":
            case "F2":
            case "L5":
            case "O6":
            case "A4":
            case "B2":
            case "O7":
            case "O8":
            case "L6":
            case "E2":
            case "A5":
            case "C2":
            case "H2":
            case "A6":
            case "R2":

                if (isLetter(String.valueOf(a)) || isNumber(String.valueOf(a))) {
                    Nodo lastChild = Nodo.getLastChildFrom(c);
                    lastChild.setValor(lastChild.getValor() + String.valueOf(a));
                } else if (a == ';') {
                    Nodo lastChild = Nodo.getLastChildFrom(c);
                    lastChild.setLiga(new Nodo("SEP", ";"));
                } else if (a == ',') {
                    Nodo lastChild = Nodo.getLastChildFrom(c);
                    lastChild.setLiga(new Nodo("SEP", ","));
                }
                  
                
                
                break;

            case "EP++--":
            case "EPOLNDD":
            case "EPOLNDA":
            case "SIDDAA":
            case "SIDDD":

                if (a == ';') {
                    Nodo lastChild = Nodo.getLastChildFrom(c);
                    lastChild.setLiga(new Nodo("Sep", ";"));
                } else if (a == ','
                        && estadoActual.equalsIgnoreCase("SIDDD")) {
                    Nodo lastChild = Nodo.getLastChildFrom(c);
                    lastChild.setLiga(new Nodo("Sep", ","));
                }
                break;

        }

        return c;
    }

    private static boolean isNumber(String a) {
        switch (a) {
            case "0":
                return true;
            case "1":
                return true;
            case "2":
                return true;
            case "3":
                return true;
            case "4":
                return true;
            case "5":
                return true;
            case "6":
                return true;
            case "7":
                return true;
            case "8":
                return true;
            case "9":
                return true;
        }

        return false;
    }

    private static boolean isLetter(String a) {

        if (a.equalsIgnoreCase("A") || a.equalsIgnoreCase("B")
                || a.equalsIgnoreCase("C") || a.equalsIgnoreCase("D")
                || a.equalsIgnoreCase("E") || a.equalsIgnoreCase("F")
                || a.equalsIgnoreCase("G") || a.equalsIgnoreCase("H")
                || a.equalsIgnoreCase("I") || a.equalsIgnoreCase("J")
                || a.equalsIgnoreCase("K") || a.equalsIgnoreCase("L")
                || a.equalsIgnoreCase("M") || a.equalsIgnoreCase("N")
                || a.equalsIgnoreCase("Ñ") || a.equalsIgnoreCase("O")
                || a.equalsIgnoreCase("P") || a.equalsIgnoreCase("Q")
                || a.equalsIgnoreCase("R") || a.equalsIgnoreCase("S")
                || a.equalsIgnoreCase("T") || a.equalsIgnoreCase("U")
                || a.equalsIgnoreCase("V") || a.equalsIgnoreCase("W")
                || a.equalsIgnoreCase("X") || a.equalsIgnoreCase("Y")
                || a.equalsIgnoreCase("Z")  || a.equalsIgnoreCase("_")         
                ) {
            return true;
        }

        return false;
    }

}
