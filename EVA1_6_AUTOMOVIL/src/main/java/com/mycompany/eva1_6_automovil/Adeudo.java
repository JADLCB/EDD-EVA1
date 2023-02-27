package com.mycompany.eva1_6_automovil;

public class Adeudo {
     private String marca;
     private String placas;
     private String modelo;
     private String dueño;
     private int año;
     
     public Adeudo (){
         marca = "*****";
         placas = "*****";
         dueño = "****";
         año = 0;
     }
     public String getmarca(){
        return marca;
    }
          public void setmarca(String valor){//SET
        marca = valor;
    }
      public String getmodelo(){
        return modelo;
    }
       public void setmodelo(String valor){//SET
        modelo = valor;
    }
     public String getplacas(){
        return placas;
    }
       public void setplacas(String valor){//SET
        placas = valor;
    }
     public String getdueno(){
        return dueño;
    }
       public void setdueno(String valor){//SET
        dueño = valor;
    }
       public int getano(){
           return año;
           
       }
       public void setano(int valor){//SET
        año = valor;
}
       public void imprimirdatos(){
        System.out.println("marca:    "+ marca  );
        System.out.println("modelo:     " + modelo);
        System.out.println("placas:    " + placas );
        System.out.println("dueno:    " + dueño );
        System.out.println("ano:    " + año );
}
              public void Adeudo(){
           if (año<=2000){
               System.out.println("adeudo de 1500$");
            }else {
               if ((año>=2001)&&(año<=2005)){
                    System.out.println("adeudo de 2000$");
                }else{
                        if((año>=2006)&&(año<=2010)){
                                System.out.println("adeudo de 2500");
                        }else{
                                if ((año>=2011)&&(año<=2015)){
                                    System.out.println("adeudo de 3000");
                                }else{
                                    if ((año>=2016)&&(año<=2023)){
                                        System.out.println("adeudo de 4000");
                                    }
                                }
                                        
                                }
       }
}
}
}
