/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircular;

/**
 *
 * @author Guest
 */
import java.util.Iterator;
import java.util.NoSuchElementException;


class Nodo {
    int dato;
    Nodo siguiente;
    Nodo anterior;

    Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}

public class ListaCircularDoblementeEnlazada {
    private Nodo cabeza;
    private int tamaño;

    public ListaCircularDoblementeEnlazada() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public int tamaño() {
        return tamaño;
    }

    public void agregarAVacia(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            nuevoNodo.siguiente = nuevoNodo;
            nuevoNodo.anterior = nuevoNodo;
            cabeza = nuevoNodo;
            tamaño++;
        }
    }

    public void agregarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            agregarAVacia(dato);
        } else {
            nuevoNodo.siguiente = cabeza;
            nuevoNodo.anterior = cabeza.anterior;
            cabeza.anterior.siguiente = nuevoNodo;
            cabeza.anterior = nuevoNodo;
            cabeza = nuevoNodo;
            tamaño++;
        }
    }

  public void agregarEnPosicionIntermedia(int dato) {
    int posicionIntermedia = (tamaño + 1) / 2; // Calcula la posición intermedia
    Nodo nuevoNodo = new Nodo(dato);

    if (estaVacia()) {
        agregarAVacia(dato); // Si la lista está vacía, simplemente agrega al inicio
    } else {
        Nodo actual = cabeza;
        int contador = 1;

        while (contador < posicionIntermedia) {
            actual = actual.siguiente;
            contador++;
        }

        nuevoNodo.siguiente = actual.siguiente;
        nuevoNodo.anterior = actual;
        actual.siguiente.anterior = nuevoNodo;
        actual.siguiente = nuevoNodo;
        tamaño++;
    }
}

    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            agregarAVacia(dato);
        } else {
            nuevoNodo.siguiente = cabeza;
            nuevoNodo.anterior = cabeza.anterior;
            cabeza.anterior.siguiente = nuevoNodo;
            cabeza.anterior = nuevoNodo;
            tamaño++;
        }
    }

    public boolean buscar(int clave) {
        if (!estaVacia()) {
            Nodo actual = cabeza;
            do {
                if (actual.dato == clave) {
                    return true;
                }
                actual = actual.siguiente;
            } while (actual != cabeza);
        }
        return false;
    }

    public boolean sonIguales(ListaCircularDoblementeEnlazada otraLista) {
        if (tamaño != otraLista.tamaño) {
            return false;
        }
        Nodo actualEstaLista = cabeza;
        Nodo actualOtraLista = otraLista.cabeza;
        do {
            if (actualEstaLista.dato != actualOtraLista.dato) {
                return false;
            }
            actualEstaLista = actualEstaLista.siguiente;
            actualOtraLista = actualOtraLista.siguiente;
        } while (actualEstaLista != cabeza && actualOtraLista != otraLista.cabeza);
        return actualEstaLista.dato == actualOtraLista.dato;
    }

    public void iteradorSentidoReloj() {
        if (!estaVacia()) {
            Nodo actual = cabeza;
            do {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            } while (actual != cabeza);
        }
    }

    public void iteradorSentidoContraReloj() {
        if (!estaVacia()) {
            Nodo actual = cabeza.anterior;
            do {
                System.out.println(actual.dato);
                actual = actual.anterior;
            } while (actual != cabeza.anterior);
        }
    }
}
   
        
                


        
   
