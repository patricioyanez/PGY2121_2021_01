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
public class Cancion {
    private String titulo;
    private int segundos;
    private boolean esFavorita;
    private boolean estaDescargada;
    private String genero;
    private Artista artista;

    public Cancion() {
        this.titulo = "";
        this.segundos = 0;
        this.esFavorita = false;
        this.estaDescargada = false;
        this.genero = "";
        this.artista = new Artista();
    }
    
    public Cancion(String titulo, int segundos, boolean esFavorita, boolean estaDescargada, String genero, Artista artista) {
        this.titulo = titulo;
        this.segundos = segundos;
        this.esFavorita = esFavorita;
        this.estaDescargada = estaDescargada;
        this.genero = genero;
        this.artista = artista;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean isEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public boolean isEstaDescargada() {
        return estaDescargada;
    }

    public void setEstaDescargada(boolean estaDescargada) {
        this.estaDescargada = estaDescargada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cancion:\n" + 
                "titulo=" + titulo + 
                ", segundos=" + segundos + 
                ", esFavorita=" + (esFavorita?"si":"no") + 
                ", estaDescargada=" + (estaDescargada?"si":"no") + 
                ", genero=" + genero + 
                ", " + artista;
    }
    
    
    protected void hola(){}
    
}
