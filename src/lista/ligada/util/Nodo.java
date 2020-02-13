/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ligada.util;

/**
 *
 * @author Usuario
 */
public class Nodo {

    private Object dato;
    private Nodo liga;

    public Nodo(Object dato) {
        this.dato = dato;
    }

    public Nodo(Object dato, Nodo liga) {
        this.dato = dato;
        this.liga = liga;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getLiga() {
        return liga;
    }

    public void setLiga(Nodo liga) {
        this.liga = liga;
    }

}
