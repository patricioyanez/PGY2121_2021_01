/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listareproduccion;

/**
 *
 * @author patri
 */
public class Artista {
    private String nombre;
    private String pais;

    public Artista() {
        this.nombre = "";
        this.pais = "";
    }
    public Artista(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Artista:\n" + "nombre=" + nombre + ", pais=" + pais;
    }
    
}
