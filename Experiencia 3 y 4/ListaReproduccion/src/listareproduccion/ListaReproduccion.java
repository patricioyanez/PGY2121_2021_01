/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listareproduccion;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class ListaReproduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear 6 canciones
        // crear 2 listados
        // asignar 3 canciones a cada lista
        // crear el menu que permita imprimir 1 u otra lista.
        Artista artista1 = new Artista("Los Bunker", "Chile");
        Artista artista2 = new Artista("Los Prisioneros", "Chile");
        
        Cancion cancion1 = new Cancion("Miño", 330, true, false, "Rock", artista1);
        Cancion cancion2 = new Cancion("Bailando solo", 430, true, false, "Rock", artista1);
        Cancion cancion3 = new Cancion("Cuentale", 430, true, false, "Rock", artista1);
        Cancion cancion4 = new Cancion("La voz de los 80", 400, true, false, "Rock", artista2);
        Cancion cancion5 = new Cancion("Las industrias", 400, true, false, "Rock", artista2);
        Cancion cancion6 = new Cancion("El baile de los qe sobran", 400, true, false, "Rock", artista2);
        // crea las 2 listas para las canciones    
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        //asigna canciones a cada una de las listas
        lista1.agregar(cancion1);
        lista1.agregar(cancion5);
        lista1.agregar(cancion3);
        lista2.agregar(cancion4);
        lista2.agregar(cancion2);
        lista2.agregar(cancion6);
            
        // lee el teclado
        Scanner leer = new Scanner(System.in);
        String opcion = "";
        
        // crea el menú
        while(!opcion.equals("0"))
        {
            System.out.println("********* MENÚ **********");
            System.out.println("1.- Mostrar lista 1");
            System.out.println("2.- Mostrar lista 2");
            System.out.println("0.- Salir del sistema");
            System.out.print("Escriba su opción: ");
            opcion = leer.next();
            
            if(opcion.equals("1"))
            {
                System.out.println("******* Lista de canciones 1 *********");
                lista1.listar();
            }
            else if(opcion.equals("2"))
            {
                System.out.println("******* Lista de canciones 2 *********");
                lista2.listar();
            }
        }
        
        
    }
    
}
