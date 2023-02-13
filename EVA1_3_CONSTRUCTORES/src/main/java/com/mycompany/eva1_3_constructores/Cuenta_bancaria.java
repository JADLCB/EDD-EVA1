/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_3_constructores;

/**
 *
 * @author ProBook
 */
class Cuenta_bancaria {
        /**
     *
     */
    private String numdecuenta;
   private String nomdelcliente;
   private double saldo;
  //constructor:
  //MODIFICADOR DE ACCESO,NOMBRE DE LA CLASE(ARGUMENTOS)
   public Cuenta_bancaria(){//CONSTRUCTOR DEFAULT
       numdecuenta="00000";
       nomdelcliente="----";
       saldo= 0.0;
       
   }
   public Cuenta_bancaria(String ncuenta,double cant,String nCliente){
       numdecuenta=ncuenta;
       saldo=cant;
       nomdelcliente=nCliente;
   }
           
   
   //metodos get y set
   
   public String getnumdecuenta(){
       return numdecuenta;
   }
   public double getsaldo(){
       return saldo;
   }
   public String getnomdelcliente(){
       return nomdelcliente;
   }
public void setnumdecuenta(String valor){
    numdecuenta=valor;
}
public void setsaldo(double valor){
    saldo=valor;
}
public void setnomdelcliente(String valor){
    nomdelcliente=valor;
   
}

    
}


