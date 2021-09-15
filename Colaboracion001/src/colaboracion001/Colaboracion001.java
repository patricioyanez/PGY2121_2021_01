package colaboracion001;

import java.util.Date;

public class Colaboracion001 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona(200, "Ana", "Lo Espejo");
        
        // modifica el valor de cada uno de los atributos
        p1.setNombre("Juan");
        p1.setRut(100);
        p1.setComuna("PAC");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        // los get permite obtene el valor actual del atributo        
        System.out.println(p2.getNombre());
        
        Entrada e1 = new Entrada(1000, 25000, new Date(), 21, "ColoColo/U", p1);
        Entrada e2 = new Entrada(1001, 25000, new Date(), 22, "ColoColo/U", p2);
        Entrada e3 = new Entrada(1002, 25000, new Date(), 23, "ColoColo/U", null);
        
        
        Persona p3 = new Persona(300, "Esteban", "Colina");
        
        
        e3.setPersona(p3);
        
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        
    }
    
}
