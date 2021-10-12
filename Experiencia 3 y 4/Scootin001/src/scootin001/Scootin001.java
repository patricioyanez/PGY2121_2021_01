/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scootin001;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class Scootin001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puesto puesto1 = new Puesto(100, "Vendedor");
        Puesto puesto2 = new Puesto(200, "Supervisor");
        
        Empleado empleado1 = new Empleado("1-9", "Ana Aros", "F", 1, 20, puesto1);
        Empleado empleado2 = new Empleado("2-7", "Maria Aros", "F", 5, 40, puesto2);
        
        empleado2.setNombreCompleto("Fernanda Díaz");
        // crear el obj empresa, ArrayList empleados es creado
        Empresa scootin = new Empresa();
        
        // guarda los empleados
        scootin.agregar(empleado1);
        scootin.agregar(empleado2);
        scootin.agregar(empleado2);
        
        // listar todos los empleados
        scootin.listar();
        
        
        // EJERCICIO: Buscar un rut (Ingresar por teclado) y eliminarlo si existe
        // volver a listar todos los empleados
        
        Scanner leer = new Scanner(System.in); 
        System.out.println("******* E L I M I N A R ***********");
        System.out.print("Ingrese un rut para eliminar: ");
        String rut = leer.next();
        
        // comparar con los rut que estan en el arrayList
        if(scootin.buscar(rut))// SI LO ENCUENTRA DEVUELVE TRUE
        {
            // SI ELIMINA DEVUELVE TRUE
            boolean res = scootin.eliminar(rut);
            if(res)
            {
                System.out.println("El rut fue eliminado");
            }
            else
            {
                System.out.println("No se elimino");
            }
        }
        else
        {// AL NO ENCONSTRAR EL RUT SE EJECUTA LA SIGUIENTE LINEA
            System.out.println("El rut no fue encontrado");            
        }
                
        
        System.out.println("*************** L I S T A D O ***********************************");
        // listar todos los empleados
        scootin.listar();
    }
    
}
