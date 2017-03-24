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

public abstract class Fitxa {
    //Aqui s'han de declarar tots els mètodes asbtractes
    //així les subclasses estan obligades a posar aquests mètodes (ex. moviments valids)
    
    int xinicial, yinicial, x, y;
    
    public boolean mort = false;
    public boolean negro;
    enum color{blanc, negre};
    Fitxa guardarPosi[][];
    String figura;
    
    public void posicioInicial( int x, int y, color color){
         
    
        xinicial = x;
        yinicial = y;
        negro = (color == color.negre);
     
        
        
    
    }
    
    
    public String toString(){
        return figura;
    }


}

