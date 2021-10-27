/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico001;

/**
 *
 * @author patri
 */
public class Zoologico001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal(2, "Perro", "cannis lupus familiaris");
        animal.comer();
        
        Mamifero perro = new Mamifero(90, 8);
        perro.comer(); // uso de sobreEscritura (cambia a otro mensaje)
        
        Mamifero persona1 = new Mamifero(270, 2);
        Mamifero persona2 = new Mamifero(270, 2);
        
        persona1.beber();
        persona2.beber("Cerveza");
        persona2.beber("Tequila", 100);        
        
        perro.setNombre("perro");
        perro.setNombreCientifico("cannis lupus familiaris");
        perro.setOjos(2);
        System.out.println(perro.toString());
    }    
}
