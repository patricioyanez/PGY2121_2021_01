package proyecto01;

public class Pizzeria {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("¿Cómo están?");
        
        //instacia // crear un objeto
        Pizza pizza1 = new Pizza();
        pizza1.calentar();
        pizza1.calentar();
        pizza1.calentar();
        //pizza1 = null;
        pizza1.calentar();
        pizza1.preparar();
        
        
        
        
        Pizza pizza2 = new Pizza("Napolitana", 
                                    "Mediana",
                "Queso, tomate, oregano y aceituna", 
                5000);
        String aux = pizza2.imprimir();
        System.out.println(aux);
        
        pizza1.setNombre("Rodeo");
        pizza1.setIngrediente("queso, Tocino, tomate, carne, barbacue");
        pizza1.setTamano("Familiar");
        pizza1.setValor(9500);       
        
        System.out.println(pizza1.imprimir());
        
    }
    
}
