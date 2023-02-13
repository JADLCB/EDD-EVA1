/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_2_clases_java;

/**
 *
 * @author invitado
 */
public class eva1_2_clases_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona perso1 = new Persona();
        /*perso1.apellidos = "Piñon";
        perso1.nombre = "Saul";
        System.out.println(perso1.nombre+" "+perso1.apellidos);*/
        perso1.setNombre("Saul");
        System.out.println(perso1.getNombre());
    }
   
}