package colaboracion001;
public class Persona {
    // attributos
    private int rut;
    private String nombre;
    private String comuna;

    // constructores
    public Persona() {
        this.rut = 0;
        this.nombre = "";
        this.comuna = "";
    }
    
    public Persona(int rut, String nombre, String comuna) {
        this.rut = rut;
        this.nombre = nombre;
        this.comuna = comuna;
    }
    
    // Getter and Setter
    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
    // metodos

    @Override
    public String toString() {
        return "=========  Persona:" + 
                "rut=" + rut + 
                ", nombre=" + nombre + 
                ", comuna=" + comuna;
    }
    
    
    
}
