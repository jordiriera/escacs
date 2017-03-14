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
public class Tauler {
       
    enum selFitxes{Peon, Alfil, Torre, Cavall, Rei, Reina};

    final int col = 8;
    final int fil = 8;
//ToDo: Traduccio lletres a numero per comunicar amb l'usuari 
//ToDo: Cridar a la classe casella per saber quina peça hi ha a cada lloc (getpeça...)
    public Casella tauler[][] = new Casella[col][fil];

    public void generarTauler() {
        boolean negraPrimera;

        for (int y = 0; y < fil; y++) {
            negraPrimera = (y % 2 == 0) ? false : true;
            for (int x = 0; x < col; x++) {

                tauler[x][y] = (negraPrimera) ? new Casella(Casella.color.negre) : new Casella(Casella.color.blanc);
                negraPrimera = !negraPrimera;
            }
        }
    }

    public void mostrarTauler() {
        for (int y = 0; y < fil; y++) {
            for (int x = 0; x < col; x++) {

                System.out.print(tauler[x][y] + " ");
            }
            System.out.println("");
        }

    }
    
    
    
    public void colocaFitxes(int x, int y, selFitxes fitxes ){
    
        
        
        
        

//new diversosjocs.Peon(0, 0, Peon.color.negre){
          
        };
        
    
    
    
    
    
}
