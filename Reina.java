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
public class Reina extends diversosjocs.Fitxa{

   
    int xinicial;
    int yinicial;
    
    public Reina (int x, int y, color color){
    
        xinicial = x;
        yinicial = y;
        negre = (color == color.negre);
        figura = (negre)? "♛":"♕";
        
    }
    
}
