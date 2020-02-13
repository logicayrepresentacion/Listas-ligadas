/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ligada.simple.sincabeza;

import lista.ligada.util.Nodo;

/**
 *
 * @author Usuario
 */
public class ListaLigadaSimpleSinCabeza {

    private Nodo primero;
    int size = 0;

    public ListaLigadaSimpleSinCabeza() {
    }

    public ListaLigadaSimpleSinCabeza(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void addNodo(Nodo nuevo) {
        nuevo.setLiga(primero);
        primero = nuevo;
        size++;
    }

    public void addDato(Object dato) {
        Nodo nuevo = new Nodo(dato);
        this.addNodo(nuevo);
    }

    public boolean isFinal(Nodo r) {
        return (r == null);
    }

    public int size() {
        return size;
    }

}
