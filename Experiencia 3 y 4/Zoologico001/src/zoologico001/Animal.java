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
public class Animal {
    private int ojos;
    private String nombre;
    private String nombreCientifico;

    public Animal() {
        this.ojos = 0;
        this.nombre = "";
        this.nombreCientifico = "";
    }
    
    public Animal(int ojos, String nombre, String nombreCientifico) {
        this.ojos = ojos;
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {        
        return "Animal:\n" + " nombre=" + nombre + ", nombre Cientifico=" + nombreCientifico + " cantidad de ojos=" + ojos;
    }
    
    public void comer()
    {
        System.out.println("El animal come :-)");
    }
    
}
