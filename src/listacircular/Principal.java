/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacircular;

import java.util.Iterator;

/**
 *
 * @author Guest
 */
public class Principal {

    public static void main(String[] args) {
        ListaCircularDoblementeEnlazada miLista = new ListaCircularDoblementeEnlazada();
        ListaCircularDoblementeEnlazada otraLista = new ListaCircularDoblementeEnlazada();

        System.out.println("La Lista 1 inicialmente está vacía? " + miLista.estaVacia());
        System.out.println("¿La Lista 2 inicialmente está vacía? " + otraLista.estaVacia());
        System.out.println();
        System.out.println("Tamaño de la Lista 1: " + miLista.tamaño());
        System.out.println("Tamaño de la Lista 2: " + otraLista.tamaño());

        System.out.println("_________________________________");
        System.out.println("Agregando elementos a la lista 1 : ");
        
        miLista.agregarAlInicio(1);
        miLista.agregarAlFinal(3);
        miLista.agregarEnPosicionIntermedia(2);

        System.out.println("Iteración en sentido de las manecillas del reloj:");
        miLista.iteradorSentidoReloj();

        System.out.println("___________________________________________________________");
        System.out.println("Iteración en sentido contrario de las manecillas del reloj:");
        miLista.iteradorSentidoContraReloj();
        System.out.println();
        System.out.println("_________________________________________________________");
        System.out.println("Tamaño de la lista: " + miLista.tamaño());
        System.out.println("¿Está lista vacía? " + miLista.estaVacia());
        System.out.println("¿Se encuentra el valor 2 en la lista? " + miLista.buscar(2));
        System.out.println();
        System.out.println("____________________________________________________________________");

        System.out.println("Agregando elementos a la lista 2 : ");
        
        otraLista.agregarAlInicio(1);
        otraLista.agregarAlFinal(3);
        otraLista.agregarEnPosicionIntermedia(4);
        
        
        System.out.println("Iteración en sentido de las manecillas del reloj:");
        otraLista.iteradorSentidoReloj();
        System.out.println();
        System.out.println("___________________________________________________________");
        System.out.println("Iteración en sentido contrario de las manecillas del reloj:");
        otraLista.iteradorSentidoContraReloj();

        System.out.println("_________________________________________________________");
        System.out.println("Tamaño de la lista: " + otraLista.tamaño());
        System.out.println("¿Está lista vacía? " + otraLista.estaVacia());
        System.out.println("¿Se encuentra el valor 2 en la lista? " + otraLista.buscar(2));

        System.out.println("____________________________________________________________________");

        System.out.println("¿Ambas listas son iguales? " + otraLista.sonIguales(miLista));

    }
}
