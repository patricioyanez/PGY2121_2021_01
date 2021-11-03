/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciointereses;

/**
 *
 * @author patri
 */
public class Entretencion {
    private String nombre;
    private int tiempoUso;

    public Entretencion() {
        this.nombre = "";
        this.tiempoUso = 0;
    }
    
    public Entretencion(String nombre, int tiempoUso) {
        this.nombre = nombre;
        this.tiempoUso = tiempoUso;
    }

    public int getTiempoUso() {
        return tiempoUso;
    }

    public void setTiempoUso(int tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Entretencion{" + "nombre=" + nombre + ", tiempoUso=" + tiempoUso + '}';
    }
    
    
    
    
}
