
package zoologico001;


public class Mamifero extends Animal{
    private int diasGestacion;
    private int cantidadUbre;


    public Mamifero() {
        this.diasGestacion = 0;
        this.cantidadUbre = 0;
    }
    
    public Mamifero(int diasGestacion, int cantidaUbre) {
        this.diasGestacion = diasGestacion;
        this.cantidadUbre = cantidaUbre;
    }

    public int getCantidadUbre() {
        return cantidadUbre;
    }

    public void setCantidadUbre(int cantidaUbre) {
        this.cantidadUbre = cantidaUbre;
    }

    public int getDiasGestacion() {
        return diasGestacion;
    }

    public void setDiasGestacion(int diasGestacion) {
        this.diasGestacion = diasGestacion;
    }

    @Override
    public String toString() {        
        return super.toString() + "Mamifero:\n{" + "diasGestacion=" + diasGestacion + ", cantidadUbre=" + cantidadUbre;
    }

    @Override
    public void comer() {
       // super.comer();
        System.out.println("El mamifero come :-)");
    }
    
    public void comer(String nombreMamifero)
    {
        System.out.println("El " + nombreMamifero +" come :-)");
    }
    
    
    // sobrecarga de metodos
    
    public void beber()
    {
        System.out.println("El o la " + getNombre() + " bebe agua");
    }
    public void beber(String liquido)
    {
        System.out.println("El o la " + getNombre() + " bebe " + liquido);
    }
    public void beber(String liquido, int cantidadCC)// centimetros cubicos
    {
        System.out.println("El o la " + getNombre() + " bebe " + cantidadCC + "CC de " + liquido);
    }
    
}

