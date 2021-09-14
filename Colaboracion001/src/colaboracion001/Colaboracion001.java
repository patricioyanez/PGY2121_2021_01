package colaboracion001;

public class Colaboracion001 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona(200, "Ana", "Lo Espejo");
        
        p1.setNombre("Juan");
        p1.setRut(100);
        p1.setComuna("PAC");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        System.out.println(p2.getNombre());
        
        Entrada e1 = new Entrada();
        //e1.setPersona(p1);
    }
    
}
