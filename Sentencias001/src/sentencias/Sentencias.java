/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencias;

/**
 *
 * @author patri
 */
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
        
        
        
        
        int grado = 8;
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
        
        
        
    }
    
}
