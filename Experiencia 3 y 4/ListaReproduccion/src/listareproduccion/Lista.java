/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listareproduccion;

import java.util.ArrayList;

/**
 *
 * @author patri
 */
public class Lista {
    ArrayList<Cancion> canciones;

    public Lista() {
        //crea el arrayList que soporta objetos creados a partir 
        // de la clase Cancion
        canciones = new ArrayList<Cancion>();
    }
    
    public boolean agregar(Cancion cancion)
    {
        return canciones.add(cancion);
    }
    
    public void listar()
    {
        for(Cancion cancion: canciones)
        {
            //System.out.println(cancion);
            System.out.println(cancion.getArtista().getNombre() + " : " + cancion.getTitulo());
        }
    }
}
