package proyecto01;

public class Pizza {
    // atributos
    private String nombre;
    private String tamano;
    private String ingrediente;
    private int valor;
    
    // constructores    lightshot
    public Pizza()
    {
        //System.out.println("El constructor se ejecutó **************");
        this.nombre = "No definido";
        this.tamano = "";
        this.ingrediente= "";
        this.valor = 0;
        //System.out.println("Constructor");
    }
    public Pizza(String nombre, String tamano, String ingrediente, int valor)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.ingrediente= ingrediente;
        this.valor = valor;
        //System.out.println("Constructor con parametros ");
    }
    
    // getter and setter    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }    
    
    // métodos customer
    
    public void preparar()
    {
        System.out.println("Se está preparando su Pizza");
    }
    
    public void calentar()
    {
        System.out.println("Se está calentando la Pizza");
    }
    
    public String imprimir()
    {
        String aux = "";
        aux = this.nombre + "\n" +
                this.tamano + "\n" +
                this.ingrediente + "\n" +
                this.valor;
        return aux;
    }

}
