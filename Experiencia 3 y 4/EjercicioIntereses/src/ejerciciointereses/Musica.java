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
public class Musica extends Entretencion  {
    private String tipo;

    public Musica() {
        this.tipo = "";
    }

    public Musica(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Musica{" + "tipo=" + tipo + '}';
    }
    
    
}
