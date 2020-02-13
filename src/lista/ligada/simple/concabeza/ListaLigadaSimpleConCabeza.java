/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ligada.simple.concabeza;

import lista.ligada.util.Nodo;

/**
 *
 * @author Usuario
 */
public class ListaLigadaSimpleConCabeza {

    private final Nodo cabeza;

    public ListaLigadaSimpleConCabeza() {
        this.cabeza = new Nodo(0);
    }

    public ListaLigadaSimpleConCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public Nodo getPrimero() {
        return cabeza.getLiga();
    }

    public void addNodo(Nodo nuevo) {
        nuevo.setLiga(cabeza.getLiga());
        cabeza.setLiga(nuevo);
        int cantidad = (Integer) cabeza.getDato();
        cantidad++;
        cabeza.setDato(cantidad);
    }

    public void addDato(Object dato) {
        Nodo nuevo = new Nodo(dato);
        this.addNodo(nuevo);
    }

    public boolean isFinal(Nodo r) {
        return (r == null);
    }

    public int size() {
        return (int) cabeza.getDato();
    }

}
