package colaboracion001;
import java.util.Date;

public class Entrada {

    int numero;
    int valor;
    Date fecha;
    int asiento;
    String nombreEvento;    
    Persona persona;
    
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
    
    
    
}
