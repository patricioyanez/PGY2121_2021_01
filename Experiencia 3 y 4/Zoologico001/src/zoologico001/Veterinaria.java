/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico001;

/**
 *
 * @author patri
 */
public class Veterinaria extends Cuidados{

    @Override
    public void vacunar() {
        System.out.println("Vacunado con jeringa normal");
    }

    @Override
    public Boolean darVitaminas(int cantidadPastillas) {
        System.out.println("se le dio " + cantidadPastillas + " de vitaminas.");
        return true;
    }



    
}
