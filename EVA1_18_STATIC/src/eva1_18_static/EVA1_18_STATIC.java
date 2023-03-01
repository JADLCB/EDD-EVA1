/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_static;

/**
 *
 * @author ProBook
 */
public class EVA1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        prueba obj= new prueba();
        obj.mensaje();
        prueba.mensajeEstatico();
        System.out.println("PI"+Math.PI);
        
    }
    
}
class prueba{
    public void mensaje(){//solo cuando es objeto se puede sacar
        System.out.println("Hola uwu");
    }
    public static void mensajeEstatico(){//se tiene que utilizar directa desde la clase
            System.out.println("Hola (Estatico)");
}
}
class Otra{
    
}