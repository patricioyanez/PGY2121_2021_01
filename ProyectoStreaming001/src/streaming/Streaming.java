/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

/**
 *
 * @author patri
 */
public class Streaming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // comienza a ejecutar desde aquí
        
        Cancion cancion1 = new Cancion();
        
        cancion1.imprimir();
        
        cancion1.setArtista("Shakira");
        cancion1.setTitulo("waka waka");
        cancion1.setSegundos(634);
        cancion1.imprimir();
        
        String aux = cancion1.getArtista();
        System.out.println("El artista es: " + aux);
        System.out.println("El artista es: " + cancion1.getArtista());
        
        Cancion cancion2 = new Cancion("el gato volar", "Cantante", 180, true, false);
        cancion2.setArtista("El Chombo");
        
        cancion2.imprimir();
        
        System.out.println("cancion 1: "  + cancion1.tipoCancion());
        System.out.println("cancion 2: "  + cancion2.tipoCancion());
        
    }
    
}
