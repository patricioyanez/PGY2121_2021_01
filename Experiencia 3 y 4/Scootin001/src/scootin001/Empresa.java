
package scootin001;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<Empleado>();
    }
    
    // agregar metodo para agregar a los empleados ???
    public boolean agregar(Empleado empleado)
    {
        return empleados.add(empleado);
    }
    
    // crear el metodo buscar v/f si existe o no el empleado
    
    
}
