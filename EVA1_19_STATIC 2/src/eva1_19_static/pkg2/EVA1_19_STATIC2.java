/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_static.pkg2;

/**
 *
 * @author ProBook
 */
public class EVA1_19_STATIC2 {
int x=100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // System.out.println(x);
        //mensajeNoEstatico();
        EVA1_19_STATIC2 obj=new EVA1_19_STATIC2();
        System.out.println(obj.x);
        obj.mensajeNoEstatico();
        mensajeEstatico();
    }
    public void mensajeNoEstatico(){//No Existe
        System.out.println("MENSAJE NOESTATICO");
    }
    public static void mensajeEstatico(){
        System.out.println("MENSAJE ESTATICO");
    }
}
