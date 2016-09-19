/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamobjetosfecha;

/**
 *
 * @author adan
 */
public class FechaDetallada extends Fecha{
    
    String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio",
    "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    public String toString(){
    
    return getDia() + " " +meses[getMes()-1]+" "+getAnio();
    }
}
