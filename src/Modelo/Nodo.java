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
public class Nodo {

    Nodo liga;
    String tipo;
    String valor;

    public static String  printList(Nodo c) {
       String mensaje="";
        if (c == null) {
            mensaje=("Lista queda vacía");

        } else {
            Nodo s = c.getLiga();
           mensaje="\n|" + c.getTipo() + "|" + c.getValor() + "|";
            while (s != null) {
                mensaje+="-->";
                mensaje+="|" + s.getTipo() + "|" + s.getValor() + "|";
                s = s.getLiga();
            }

        }
return mensaje;
    }
    
    public Nodo() {
    }

    public Nodo(String tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public static Nodo deleteLastChild(Nodo c) {

        if (c == null) {
            return c;
        }
        Nodo nBefore = null;
         Nodo next=c;
         while(next.getLiga()!=null)
         {
         nBefore=next;
         next=next.getLiga();
         }
         
         nBefore.setLiga(null);
         return c;
         
    }

    public static Nodo getLastChildFrom(Nodo c) {
        if (c == null) {
            return new Nodo();
        }
        if (c.getLiga() == null) {
            return c;
        }
        return getLastChildFrom(c.getLiga());
    }

}
