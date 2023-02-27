/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_llamada_funcion;

/**
 *
 * @author ProBook
 */
public class EVA1_8_LLAMADA_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("INICIAR main()");
       A();
       System.out.println("TERMINA main()");
     
    }
    public static void A(){
        
       System.out.println("INICIAR A()");
       B();
       System.out.println("TERMINA A()");
     
    }
    public static void B(){
        
       System.out.println("INICIAR B()");
     
       System.out.println("TERMINA B()");
    }
    }

