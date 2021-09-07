
package sentencias;
import java.util.Scanner; // permite leer el teclado


public class Sentencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        nota = 55;
        
        int nota1 = 40;
        
        
        if(nota == 60)
            System.out.println("Ud. Aprobó");
 
            
        
        if(nota >= 60)
        {
            System.out.println("Ud tiene buena nota");
            System.out.println("Ud tiene buena nota");
        }
        
        if(nota < 50)
            System.out.println("Ud tiene bajo 50");
        else
        {
            System.out.println("Ud tiene sobre 50");
        }
        
        if(nota < 40)
        {
            System.out.println("Rendimiento malo");
        }
        else if(nota < 50)
        {
            System.out.println("Rendimiento bueno");
        }
        else if(nota < 65)
            System.out.println("Rendimiento muy bueno");
        else
            System.out.println("Rendimiento excelente");
        
        
        
        
        int grado = 3;
        String curso = "";        
        switch(grado)
        {
            case 1:
                curso= "Primero básico";
                break;                
            case 2:
                curso= "Segundo básico";
                break;
            case 3:
                curso= "Tercero básico";
                break;                
            case 4:
                curso= "Cuarto básico";
                break;                
            case 5:
                curso= "Quinto básico";
                break;                
            case 6:
                curso= "Sexto básico";
                break;
            default:
                curso= "No especificado";
                break;
        }
        System.out.println("Curso es: " + curso);
        
        
        //** while for **//
        int numero = 1;
        while(numero <= 10)
        {
            System.out.println("nro: " + ++numero);
        }
        
        while(numero != 0)
        {
            System.out.println("nro opuesto: " + --numero);
        }
        
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("for: " + i);
        }

        int index = 0;
        for(; index < 5;)
        {
            System.out.println("for 2: " + index++);
        }
        System.out.println("variable: " + index);
        
        
        /** menu **/
        String opcion = "";
        // crea el objeto que permite leer el teclado
        Scanner teclado = new Scanner(System.in);
        while(!opcion.equals("5"))  
        {
            System.out.println("|**** M e n u *****|");
            System.out.println("1.- Ingreso");
            System.out.println("2.- Modificar");
            System.out.println("3.- Eliminar");
            System.out.println("4.- Listar");
            System.out.println("5.- Salir");
            System.out.print("Ingrese opción: ");
            opcion = teclado.next();
        }
        
    }
    
}
