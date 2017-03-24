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
public class Alfil extends diversosjocs.Fitxa{

   
    enum color{blanc, negre};
    int xinicial;
    int yinicial;
    
    public Alfil (int x, int y, color color){
    
        xinicial = x;
        yinicial = y;
        negro = (color == color.negre);
        
        
    }
    
}
