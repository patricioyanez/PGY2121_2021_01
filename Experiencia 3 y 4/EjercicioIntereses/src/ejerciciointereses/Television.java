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
public class Television extends Entretencion  {
    private String genero;
    private String canal;

    public Television() {
        this.genero = "";
        this.canal = "";
    }
    public Television(String genero, String canal) {
        this.genero = genero;
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Television{" + "genero=" + genero + ", canal=" + canal + '}';
    }
    
    
    
}
