
package com.mycompany.eva1_4_television;

/**
 *
 * @author ProBook
 */
public class Television {
    private boolean power;//prendido y anagado, atributos
    private int volumen;
    private int canal;
    //Metodos:comportamiento
    //construtor:
    public Television(){//constructor default
        power = false;//apagado
        volumen= 0;
        canal= 5;
    }
    public void cambiarPower(){
        if(power== false){//apagado
            power = true;//encendemos la tv
            System.out.println("Television encendida");
        }else{
            power = false;
            System.out.println("Television apagada");
        }
    }
    public void subirVolumen(){
        if(power == true){
            if(volumen < 100){
                
            
        volumen = volumen+5;
        System.out.println("volumen"+ volumen);
        }
        }
    }
    public void bajarvolumen(){
        
        if(power ==true){
            if(volumen > 0){
        volumen = volumen - 5;
        System.out.println("volumen" + volumen);
                }
        }
    }
    
    public void subircanal(){
        if (power == true){
            if(canal < 100)
                canal = canal + 1;
               
                else 
                canal=0;
                System.out.println("canal"+canal);
                        
            }
        }
            
    
    
    
    public void bajarcanal(){
         if (power == true){
            if(canal > 0)
                canal = canal - 1;
               
                else 
                canal=100;
                System.out.println("canal" + canal);
            



   
}
    }
}



