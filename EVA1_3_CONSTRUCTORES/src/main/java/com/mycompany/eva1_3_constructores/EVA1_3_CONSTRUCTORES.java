/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_3_constructores;

/**
 *
 * @author ProBook
 */
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
     Cuenta_bancaria cuenta1=new Cuenta_bancaria("100", 1000000, "pedro  pascal");//este es elconstructor
    
     System.out.println("Datosdelcliente");
     System.out.println(cuenta1.getnomdelcliente());
     System.out.println(cuenta1.getnumdecuenta());
     System.out.println(cuenta1.getsaldo());
     
     Cuenta_bancaria cuenta2= new Cuenta_bancaria();
     System.out.println("Datosdelcliente");
     System.out.println(cuenta2.getnomdelcliente());
     System.out.println(cuenta2.getnumdecuenta());
     System.out.println(cuenta2.getsaldo());
     
     Cuenta_bancaria cuenta3= new Cuenta_bancaria("12311",108,"jesus");
    System.out.println("Datosdelcliente");
     System.out.println(cuenta3.getnomdelcliente());
     System.out.println(cuenta3.getnumdecuenta());
     System.out.println(cuenta3.getsaldo());
     
    }
}
