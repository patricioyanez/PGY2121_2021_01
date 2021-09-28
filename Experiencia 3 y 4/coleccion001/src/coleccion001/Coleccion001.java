package coleccion001;
import java.util.ArrayList;
public class Coleccion001 {

    public static void main(String[] args) {
        // creación de una colección ArrayList
        ArrayList<String> nombres;
        nombres = new ArrayList<String>();
        
        // en un linea
        ArrayList<String> apellidos = new ArrayList<String>();
        
        // agrega elementos a la colección
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Pedro");
        nombres.add("Antonio");
        
        // recorre la colección
        for(String aux: nombres )
        {
            System.out.println("El nombre es: " + aux);
        }
        
        //ArrayList<int> numeros; // no funciona
        ArrayList<Integer> numeros;
        
        // Ejercicios:
        // a la coleccion apellidos agregar 5 elementos
        // mostrar en la consola y que siempre se vean
        // en mayuscula
        
        apellidos.add("Perez");
        apellidos.add("Diaz");
        apellidos.add("Ramos");
        apellidos.add("Pozo");
        apellidos.add("aros");
        
        for(String aux: apellidos)
        {
            System.out.println("Los apellidos son: " + aux.toUpperCase() );
        }
        
        
        
    }
    
}
