/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamobjetosfecha;


public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(int dia,int mes,int anio){
    this.dia=dia;
    this.mes=mes;
    this.anio=anio;
    
    }
    public Fecha(){
    
    }
    
    public Fecha(String cadena){
    int posicion1=cadena.indexOf('/'); //indexOf retrona la primera posicion cuando encuentra el argumento 
    int posicion2=cadena.lastIndexOf('/');
    
    dia= Integer.parseInt(cadena.substring(0,posicion1));
    mes=Integer.parseInt(cadena.substring(posicion1 +1,posicion2));
    anio= Integer.parseInt(cadena.substring (posicion2+1));
    
    }
    
 public void setDia(int dia){
 this.dia=dia;
 }   
 public int getDia(){
 return dia;
 }
 
 public void setMes(int mes){
 this.mes=mes;
 }   
 public int getMes(){
 return mes;
 }
 
 public void setAnio(int anio){
 this.anio=anio;
 }   
 public int getAnio(){
 return anio;
 }
 
 public String toString(){
 return dia + "/" +mes +"/"+ anio;
 }
}
