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
        
        System.out.println("\n\n************ Métodos *************");
        
        int cantidad = 0;
        // permite saber cuantos elementos hay en la colección apellidos
        cantidad = apellidos.size();
        System.out.println("Cantidad de elementos: " + cantidad);
        
        // permite limpiar o vaciar la colección
        apellidos.clear();
        cantidad = apellidos.size();
        System.out.println("Cantidad de elementos ahora: " + cantidad);
        
        // permite saber si el elemento especificado exite en la colección
        Boolean existe = false;
        existe = nombres.contains("Ana");
        System.out.println("Existe Ana?: " + (existe?"si":"no"));
        System.out.println("existe el nombre: " + existe);
        
        // rescatar el elementos según el indice especificado        
        System.out.println("El elemento es: " + nombres.get(2) );
        
        // permite saber si existe el elemento o no
        // 0 o nro +
        System.out.println("Existe: " + nombres.indexOf("Antonio"));
        System.out.println("Existe: " + nombres.indexOf("David"));
        
        System.out.println("Existe: " + (nombres.indexOf("David")>=0?"si": "No") );
        
        int indice = -2;
        indice = nombres.indexOf("David");
        if(indice >= 0)
            System.out.println("Existe");
        else
            System.out.println("No existe");
        
        // permite eliminar un elemento según el indice o elemento especificado
        System.out.println("Eliminado: " + nombres.remove(0));
        System.out.println("Eliminado: " + nombres.remove("David"));        
        System.out.println("ahora hay: " + nombres.size());
    }
    
}
