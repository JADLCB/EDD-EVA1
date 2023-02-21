/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_circulo;

import static java.lang.Math.PI;

/**
 *
 * @author ProBook
 */
public class Area_perimetro {
    private int radio;
    private double diametro;
  private String area;
private int perimetro;    

public Area_perimetro(){



}
public Area_perimetro(int r,int d,String a){
    area=a;
    radio=r;
    diametro=d;
}
public int getradio(){
 

        return radio;
}



public int getdiametro(){

    
    
        return (int) diametro;  
}
public int setdiametro(int valor){
    diametro=valor;
        
    System.out.println((diametro*PI));
        return perimetro;
}
public int setradio(int valor){
radio=valor;
    System.out.println((radio*radio*PI));
return radio;
}

}
