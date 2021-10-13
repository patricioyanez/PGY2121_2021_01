package colaboracion001;
import java.util.Date;

public class Entrada {

    private int numero;
    private int valor;
    private Date fecha;
    private int asiento;
    private String nombreEvento;    
    private Persona persona;
    
    public Entrada() {
        this.numero = 0;
        this.valor = 0;
        this.fecha = new Date();
        this.asiento = 0;
        this.nombreEvento = "";
        this.persona = new Persona();
    }
    public Entrada(int numero, int valor, Date fecha, int asiento, String nombreEvento, Persona persona) {
        this.numero = numero;
        this.valor = valor;
        this.fecha = fecha;
        this.asiento = asiento;
        this.nombreEvento = nombreEvento;
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    
    // métodos

    @Override
    public String toString() {
        return "===== Entrada:" + 
                "numero=" + numero + 
                ", valor=" + valor + 
                ", fecha=" + fecha + 
                ", asiento=" + asiento + 
                ", nombreEvento=" + nombreEvento + 
                ", persona=" + persona;
    }
    
    public void descuento()
    {
        System.out.println("descuento realizado");
    }
    
    
    
    
}
