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
public class Cancion {
    // atributos
    private String titulo;
    private String artista;
    private int segundos;
    private Boolean esFavorita;
    private Boolean estaDescargada;
    
    // constructores

    public Cancion() {
        this.titulo = "";
        this.artista = "";
        this.segundos = 0;
        this.esFavorita = false;
        this.estaDescargada = false;
    }
    public Cancion(String titulo, String artista, int segundos, Boolean esFavorita, Boolean estaDescargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.segundos = segundos;
        this.esFavorita = esFavorita;
        this.estaDescargada = estaDescargada;
    }
    
    // getter and setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Boolean getEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(Boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public Boolean getEstaDescargada() {
        return estaDescargada;
    }

    public void setEstaDescargada(Boolean estaDescargada) {
        this.estaDescargada = estaDescargada;
    }
    
    // metodos customer
    
    public int adelantar(int segundosActual, int segundoAdelantar)
    {
        //segundosActual = segundosActual + segundoAdelantar;
        segundosActual += segundoAdelantar;
        return segundosActual;
    }
  
    public void imprimir()
    {
        System.out.println("Datos de la canción");
        System.out.println("Titulo  : " + this.titulo);
        //System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Artista : " + this.getArtista());
        int minutos = (int)(this.segundos / 60);
        int segundos= this.segundos - (minutos * 60);
        System.out.println("Duración: " + minutos + ":" + segundos);
        System.out.println("Es favorita: " + this.esFavorita);
        System.out.println("Esta descargada: " + this.estaDescargada);
    }
    
    public String tipoCancion()
    {        
        if(this.segundos >= 300)
            return "Canción extensa";
        else 
            return "Canción corta";
    }
    
}
