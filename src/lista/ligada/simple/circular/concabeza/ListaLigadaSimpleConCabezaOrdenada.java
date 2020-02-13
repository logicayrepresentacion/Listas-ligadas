/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ligada.simple.circular.concabeza;

import lista.ligada.util.NodoComparable;

/**
 *
 * @author Usuario
 */
public class ListaLigadaSimpleConCabezaOrdenada {

    private final NodoComparable cabeza;

    public ListaLigadaSimpleConCabezaOrdenada() {
        this.cabeza = new NodoComparable(0);
        cabeza.setLiga(cabeza);
    }

    public ListaLigadaSimpleConCabezaOrdenada(NodoComparable cabeza) {
        this.cabeza = cabeza;
        cabeza.setLiga(cabeza);
    }

    public NodoComparable getCabeza() {
        return cabeza;
    }

    public NodoComparable getPrimero() {
        return cabeza.getLiga();
    }

    public void addNodo(NodoComparable nuevo) {

        NodoComparable r = this.getPrimero();
        NodoComparable u = cabeza;
        while (!this.isFinal(r)) {
            System.out.println(" este ciclo" + r.getDato());
            Comparable dato1 = r.getDato();
            Comparable nuevoDato = nuevo.getDato();
            if (dato1.compareTo(nuevoDato) < 0) {
                u = r;
                r = r.getLiga();
            } else {
                break;
            }
        }

        nuevo.setLiga(u.getLiga());
        u.setLiga(nuevo);

        nuevo.setLiga(cabeza.getLiga());
        cabeza.setLiga(nuevo);

        int cantidad = (Integer) cabeza.getDato();
        cantidad++;
        cabeza.setDato(cantidad);
    }

    public void addDato(Comparable dato) {
        NodoComparable nuevo = new NodoComparable(dato);
        this.addNodo(nuevo);
    }

    public boolean isFinal(NodoComparable r) {
        return (r == cabeza);
    }

    public int size() {
        return (int) cabeza.getDato();
    }

}
