package colaboracion001;

import java.util.Date;
import java.text.SimpleDateFormat;  
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

        Date date = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate= formatter.format(date);  
        System.out.println(strDate);          
        
        e3.setPersona(p3);       
        
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        
        //¿Cuál es el nombre de la persona que compró la entrada 2?
        System.out.println("\n =============");
        System.out.print("El nombre de la persona es:" );
        
        System.out.println(e2.getPersona().getNombre() );
        
        // ¿Cual es la comuna de la persona que compro la entrada 3?
        
        System.out.print("Comuna del cliente entreda 3:" );        
        System.out.println(e3.getPersona().getComuna() );
        
        
        // obtener todos los datos de la persona que compró la entrada 1?
        System.out.print("Datos de la persona entrada 1000:" );        
        System.out.println("\n" + e3.getPersona() );
        System.out.println("\n" + e3.getPersona().toString() );
        
        if(e1==e1)
            System.out.println("true");
        
        if(e1!=e2)
            System.out.println("false");
        
    }
    
}
