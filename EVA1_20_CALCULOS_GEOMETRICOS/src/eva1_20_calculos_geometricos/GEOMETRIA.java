/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_20_calculos_geometricos;

/**
 *
 * @author ProBook
 */
public class GEOMETRIA {
    //constante:
    public static final double PI =3.1416;
            
    //Perinetro de un circulo
    public static double PerimetroCirculo(double Radio){
        return PI*(Radio*2);
    }
    //area deuncirculo
    public static double areaCirculo(double radio){
        return PI*(radio*radio);
    }
    //volumen delaesfera
    public static double volumenesfera(double radio){
        return (4.0/3.0)*(PI*(radio*radio*radio));
    }
    
}
