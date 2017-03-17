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
    Fitxa tipo;
    boolean ocupat;
    public Casella(color colorfitxa){
        //introduir colors
        
        negre = (colorfitxa == color.negre) ? true : false;
            }
    
    public String toString(){
        return (negre)? "N":"B";
    }
    
    public void setpeca(){
        
    }
    public void getpeca(){
        
    }
    
    public void guardaFitxa(Fitxa guardar){
        this.tipo = guardar;
        ocupat=true;
    }
}
        
    

