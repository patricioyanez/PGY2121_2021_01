/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scootin001;

/**
 *
 * @author patri
 */
public class Puesto {
    private int codigo;
    private String nombre;

    public Puesto() {
        this.codigo = 0;
        this.nombre = "";
    }
    
    public Puesto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() { // imprimir
        return "Puesto: \n" + 
                "codigo=" + codigo + 
                ", nombre=" + nombre;
    }
    
    
    
}
