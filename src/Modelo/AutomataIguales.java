/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alejandro Rios
 */
public class AutomataIguales {

    public static ModelMessagePackage Automata(char a, String secuencia, int n, int linea, String estadoActual, Nodo c) {
        c = listar(c, estadoActual, a);

        ModelMessagePackage message = new ModelMessagePackage();
        message.setC(c);

        String mensaje = "";
        String estadoPrevioError = estadoActual;

        if (estadoActual.equals("EI")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "I";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "F";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "L";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "B";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "C";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VARN";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EI";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "SIG";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "SIG";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "CS";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERROR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("EPVAR")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "I";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "F";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "L";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "B";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "C";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VARN";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "CS";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERROR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("I")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "N";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("N")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "R";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("L")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "O";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("O")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "N2";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("N2")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "R";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("F")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "L2";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("L2")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "O2";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("O2")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "A";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("A")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "R";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("B")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "O3";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("O3")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "O4";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("O4")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "L3";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("L3")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "E";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("E")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "A2";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("A2")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "R";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("C")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "H";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("H")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "A3";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("A3")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "R";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("R")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
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
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERROR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("EVAR")) {
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
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("VAR")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("VARN")) {
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
                estadoActual = "VARN";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "VARNC";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("VARNC")) {
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
                estadoActual = "VARNCC";
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
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERROR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("VARNCC")) {
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
                estadoActual = "VARNCC";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "&1";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "|1";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("SIG")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "I";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "F";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "L";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "B";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "C";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VARN";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "SIG";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "CS";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERROR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("CS")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "CSL";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "CSL";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "CSL";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "CSL";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("CSL")) {
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
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "EVAR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERROR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("&1")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "I";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "F";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "L";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "B";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "C";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VARN";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "CS";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERROR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("|1")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "I";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "F";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "L";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "B";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "C";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "VAR";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "VAR";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "VAR";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "VARN";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "EPVAR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "CS";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "EPVAR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("ERROR")) {
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
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERROR";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERROR";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERROR";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("ERRORC")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "ERRORC";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "ERRORC";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ERRORC";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ERRORC";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ERRORC";
            } else {
                estadoActual = "ERROR";
            }
        } else if (estadoActual.equals("ACEPTE")) {
            if (String.valueOf(a).equals("i")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("n")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("t")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("f")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("l")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("o")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("a")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("g")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("b")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("e")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("c")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("h")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("r")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("u")) {
                estadoActual = "ACEPTE";
            } else if (isLetter(String.valueOf(a))) {
                estadoActual = "ACEPTE";
            } else if (isNumber(String.valueOf(a))) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals(" ")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("=")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("-")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("+")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals(";")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("'")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals(".")) {
                estadoActual = "ACEPTE";
            } else if (isOperator(String.valueOf(a))) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("&")) {
                estadoActual = "ACEPTE";
            } else if (String.valueOf(a).equals("|")) {
                estadoActual = "ACEPTE";
            } else {
                estadoActual = "ERROR";
            }
        }
        if (estadoActual.equalsIgnoreCase("ERROR") || estadoActual.equalsIgnoreCase("ERRORC")) {
            mensaje += "\n" + getErrorMistake(estadoPrevioError, String.valueOf(a), linea, n, secuencia);
        }
        String[] result = new String[2];
        result[0] = estadoActual;
        result[1] = mensaje;
        message.setMensaje(result);

        return message;

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

    private static boolean isOperator(String a) {
        switch (a) {
            case "/":
                return true;
            case "*":
                return true;
            case "%":
                return true;
            case "^":
                return true;
            case "~":
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
                || a.equalsIgnoreCase("Z") || a.equalsIgnoreCase("_")) {
            return true;
        }

        return false;
    }

    public static String getErrorMistake(String estadoE, String entr, int linea, int posicion, String secuencia) {
        String err = "";

        String estadoDeError = estadoE;
        String entrada = entr;
        String selectError = getStringEspacioSelectError(posicion);
        switch (estadoDeError) {
            case "EI":
                err += "Se espera una letra para continuar variable,  '+', '-', o '''  e ingresó: " + entrada + "\n";
                break;
            case "EPVAR":
                err += "Se espera una letra para iniciar o continuar variable e ingresó: " + entrada + "\n";
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
                err += "Se espera una letra para continuar variable o operador e ingresó " + entrada + "\n";
                break;
            case "R":
                err += "Palabra reservada";
                break;
            case "EVAR":
                err += "Se espera que ingrese operador después de una variable e ingresó " + entrada + "\n";
                break;
            case "VAR":
                err += "Se espera una letra para continuar variable o un operador e ingresó" + entrada + "\n";
                break;

            case "VARN":
                err += "Se espera un número para continuar variable o un operador e ingresó" + entrada + "\n";
                break;

            case "SIG":
                err += "Se espera que ingrese letra para variable o ''' e ingresó" + entrada + "\n";
                break;

            case "CS":
                err += "Char debe contener un caracter o espacio e ingresó " + entrada + "\n";
                break;
            case "CSL":
                err += "Char solo puede contener un caracter o espacio e ingresó " + entrada + "\n";
                break;
            case "&1":
            case "|1":
                err += "Se espera variable después de operador e ingresó: " + entrada + "\n";
                break;
            case "VARNC":
                 err += "Se espera número para parte decimal e ingresó: " + entrada + "\n";
                break;
                 case "VARNCC":
                 err += "Se espera número para parte decimal, operador o fin de secuencia  e ingresó: " + entrada + "\n";
                break;
                
        }

        return err;
    }

    public static String getStringEspacioSelectError(int pos) {

        String s = "";
        for (int i = 1; i < pos; i++) {
            s += "-";
        }
        s += "^";
        return s;
    }

    private static Nodo listar(Nodo c, String estadoActual, char a) {

        switch (estadoActual) {
            case "EI":
                if (isNumber(String.valueOf(a))) {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("CTE", String.valueOf(a)));
                    edt = edt.getLiga();
                } else if (isLetter(String.valueOf(a))) {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("VAR", String.valueOf(a)));
                    edt = edt.getLiga();
                } else if (a == '-' || a == '+') {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("OPDOR", String.valueOf(a)));
                    edt = edt.getLiga();
                }
                break;
            case "EPVAR":
                if (isNumber(String.valueOf(a))) {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("CTE", String.valueOf(a)));
                    edt = edt.getLiga();
                } else if (isLetter(String.valueOf(a))) {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("VAR", String.valueOf(a)));
                    edt = edt.getLiga();
                } else if (a == '\'') {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("OPDOR", String.valueOf(a)));
                    edt = edt.getLiga();
                }
                break;
            case "&1":
                if (a == '&') {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("OPDOR", "&&"));
                    edt = edt.getLiga();
                } else {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("OPDOR", "&"));
                    edt = edt.getLiga();
                }
                break;
            case "|1":
                if (a == '|') {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("OPDOR", "||"));

                } else {
                    Nodo edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("OPDOR", "|"));
                }
                break;
            case "CS":
                Nodo edt = Nodo.getLastChildFrom(c);
                edt.setLiga(new Nodo("CTEchar", "'" + String.valueOf(a) + "'"));
                break;

            default:
                if (estadoActual.equalsIgnoreCase("VARN") && a == '.') {
                    edt = Nodo.getLastChildFrom(c);
                    edt.setValor(edt.getValor() + String.valueOf(a));
                } else if (isNumber(String.valueOf(a)) || isLetter(String.valueOf(a))) {
                    edt = Nodo.getLastChildFrom(c);
                    edt.setValor(edt.getValor() + String.valueOf(a));
                } else if (isOperator(String.valueOf(a)) || a == '+' || a == '-') {
                    edt = Nodo.getLastChildFrom(c);

                    edt.setLiga(new Nodo("OPDOR", String.valueOf(a)));
                } else if (!estadoActual.equalsIgnoreCase("CS") && a == ';') {
                    edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("SEP", String.valueOf(a)));

                } else if (!estadoActual.equalsIgnoreCase("ERROR") && a == ',') {
                    edt = Nodo.getLastChildFrom(c);
                    edt.setLiga(new Nodo("SEP", String.valueOf(a)));
                }

                break;

        }

        return c;
    }

}
