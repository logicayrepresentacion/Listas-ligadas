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
public class NodoComparable {

    private Comparable dato;
    private NodoComparable liga;

    public NodoComparable(Comparable dato) {
        this.dato = dato;
    }

    public NodoComparable(Comparable dato, NodoComparable liga) {
        this.dato = dato;
        this.liga = liga;
    }

    public Comparable getDato() {
        return dato;
    }

    public void setDato(Comparable dato) {
        this.dato = dato;
    }

    public NodoComparable getLiga() {
        return liga;
    }

    public void setLiga(NodoComparable liga) {
        this.liga = liga;
    }

}
