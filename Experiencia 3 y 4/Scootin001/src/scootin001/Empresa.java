
package scootin001;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        // crea el ArrayList
        this.empleados = new ArrayList<Empleado>();
    }
    
    // agregar metodo para agregar a los empleados ???
    public boolean agregar(Empleado empleado)
    {
        // validar que no se repita el empleado, usando el rut como 
        // id unico
        for(Empleado aux: empleados)
        {
            if(aux.getRut().equals( empleado.getRut()))
            {
                System.out.println("El rut " + aux.getRut() + ", ya existe");
                return false;
            }
        }
        
        return empleados.add(empleado);
    }
    // crear el metodo buscar v/f si existe o no el empleado
    // la búsqueda se debe hacer por rut
    public boolean buscar(String rut)
    {
        for(Empleado empleado: empleados)
        {
            if(rut.equalsIgnoreCase(empleado.getRut()))
                return true;
        }
        return false;
    }
    // Crear metodo listar. muestra todos los empleado por consola
    public void listar() // no devuelve dato
    {
        for(Empleado empleado: empleados)
        {
            //System.out.println(empleado);
            System.out.println("rut: " + empleado.getRut() + 
                                " nombre: " +empleado.getNombreCompleto() );
        }
    }
    // Eliminar un empleado por medio del rut 
    public boolean eliminar(String rut)
    {
        for(Empleado empleado: empleados)
        {
            if(rut.equalsIgnoreCase(empleado.getRut()))
                // elimina el empleado actual de la coleccion. True = eliminado
                return empleados.remove(empleado);
        }
        return false; // false no se elimino. no existe rut
    }
    
    
}
