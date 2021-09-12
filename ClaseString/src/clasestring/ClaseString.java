package clasestring;
public class ClaseString {

    public static void main(String[] args) {

        String texto;
        texto = "hola";
        
        String texto2 = "buenos dias";
        
        String texto3 = new String("Buenas tardes");
        
        String rut = " 14100200-K ";
        
        System.out.println("Cantidad de caracteres: " + rut.length());
        System.out.println("Elimina los espacios de los costados: _" + rut.trim() + "_");
        System.out.println("aa".equals("aa")); // true pq son iguales
        System.out.println("aa".equals("AA")); //false pq no son iguales
        System.out.println("aa".equalsIgnoreCase("AA")); // da igual si es may o min
        System.out.println("subString: "+ ( rut.trim().substring(0, 4)));
        System.out.println("14.100.200-k".replace(".", "").replace("-", "") ); // 14100200k
        System.out.println("mayuscula".toUpperCase());
        System.out.println("MINUSCULA".toLowerCase());
        
        
    }
    
}
