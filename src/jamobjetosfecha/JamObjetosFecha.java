/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamobjetosfecha;


public class JamObjetosFecha {

   static int num;
    public static void main(String[] args) {
      Fecha f= new Fecha();
     f.setAnio(2016);
     f.setDia(19);
     f.setMes(9);
     
     Fecha segundaF= new Fecha(20,9,2016);
     
     System.out.println(f + "\n" + segundaF);
     FechaDetallada q=new FechaDetallada();
      q.setAnio(2016);
     q.setDia(19);
     q.setMes(9);
     
     System.out.println(q);
      
    }
   
}
