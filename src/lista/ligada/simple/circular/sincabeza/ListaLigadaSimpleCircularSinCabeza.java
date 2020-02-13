/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ligada.simple.circular.sincabeza;

import lista.ligada.util.Nodo;

/**
 *
 * @author Usuario
 */
public class ListaLigadaSimpleCircularSinCabeza {

    private Nodo primero;
    int size = 0;

    public ListaLigadaSimpleCircularSinCabeza() {
    }

    public ListaLigadaSimpleCircularSinCabeza(Nodo nodo) {
        this.primero = nodo;
        this.primero.setLiga(nodo);
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void addNodo(Nodo nuevo) {
        if (primero == null) {
            primero = nuevo;
            this.primero.setLiga(nuevo);

        } else {
            nuevo.setLiga(primero.getLiga());
            primero.setLiga(nuevo);
        }
        size++;
    }

    public void addDato(Object dato) {
        Nodo nuevo = new Nodo(dato);
        this.addNodo(nuevo);
    }

    public boolean isPrimero(Nodo r) {

        return (r == primero);

    }

    public int size() {
        return size;
    }

}
