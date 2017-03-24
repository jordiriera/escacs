/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversosjocs;

/**
 *
 * @author ifc33a
 */
public class Casella {
    enum color {blanc, negre};
    boolean negre;
    Fitxa fitxes;
    boolean ocupat;
    public Casella(color colorfitxa){
        //introduir colors
        
        negre = (colorfitxa == color.negre) ? true : false;
            }
    
    public String toString(){
        if (!ocupat){
        return (negre)? "☒" : "☐";
        }else {
            return fitxes.toString();
        }
    }
    
    
    public void guardaFitxa(Fitxa guardar){
        this.fitxes = guardar;
        ocupat=true;
    }
}
        
    

