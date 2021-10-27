
package zoologico001;


public class Mamifero extends Animal{
    private int diasGestacion;
    private int cantidaUbre;


    public Mamifero() {
        this.diasGestacion = 0;
        this.cantidaUbre = 0;
    }
    
    public Mamifero(int diasGestacion, int cantidaUbre) {
        this.diasGestacion = diasGestacion;
        this.cantidaUbre = cantidaUbre;
    }

    public int getCantidaUbre() {
        return cantidaUbre;
    }

    public void setCantidaUbre(int cantidaUbre) {
        this.cantidaUbre = cantidaUbre;
    }

    public int getDiasGestacion() {
        return diasGestacion;
    }

    public void setDiasGestacion(int diasGestacion) {
        this.diasGestacion = diasGestacion;
    }

    @Override
    public String toString() {        
        return super.toString() + "Mamifero:\n{" + "diasGestacion=" + diasGestacion + ", cantidaUbre=" + cantidaUbre;
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("El mamifero come :-)");
    }
    
    
    // sobrecarga de metodos
    
    public void beber()
    {
        System.out.println("El mamifero bebe agua");
    }
    public void beber(String liquido)
    {
        System.out.println("El mamifero bebe " + liquido);
    }
    public void beber(String liquido, int cantidadCC)// centimetros cubicos
    {
        System.out.println("El mamifero bebe " + cantidadCC + "CC de " + liquido);
    }
    
}

