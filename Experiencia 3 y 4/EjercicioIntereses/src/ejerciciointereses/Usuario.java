/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciointereses;

import java.util.ArrayList;

/**
 *
 * @author patri
 */
public class Usuario {
    private String nombre;
    private String clave;
    private ArrayList<Entretencion> intereses;

//    public Usuario(String nombre, String clave, ArrayList<Entretencion> intereses) {
//        this.nombre = nombre;
//        this.clave = clave;
//        this.intereses = intereses;
//    }

    public Usuario() {
        this.nombre = "";
        this.clave = "";
        this.intereses = new ArrayList<Entretencion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Entretencion> getIntereses() {
        return intereses;
    }

    public void setIntereses(ArrayList<Entretencion> intereses) {
        this.intereses = intereses;
    }
    
    // metodos customer:
    
}
