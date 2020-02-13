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
public class Ejemplo1Ordenado {

    public static void main(String[] args) {
        ListaLigadaSimpleConCabezaOrdenada miLista = new ListaLigadaSimpleConCabezaOrdenada();
        miLista.addDato("este es el registro 0");
        miLista.addDato("este es el registro 1");
        miLista.addDato("este es el registro 2");
        miLista.addDato("este es el registro 3");
        miLista.addDato("este es el registro 4");

        System.out.println("Cantidad de datos " + miLista.size());

        NodoComparable r = miLista.getPrimero();
        while (!miLista.isFinal(r)) {
            System.out.println(r.getDato());
            r = r.getLiga();
        }
    }
}
