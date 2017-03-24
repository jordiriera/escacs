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
    
   enum color{blanc, negre};
    enum selFitxes{Peon, Alfil, Torre, Cavall, Rei, Reina};

    final int col = 8;
    final int fil = 8;
//ToDo: Traduccio lletres a numero per comunicar amb l'usuari 
//ToDo: Cridar a la classe casella per saber quina peça hi ha a cada lloc (getpeça...)
    public Casella tauler[][] = new Casella[col][fil];

    //public Casella guardarPosi[][] = new Casella[col][fil];

      
    
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
        System.out.println();

    }
    

    
    public void creaFitxes(int x, int y, selFitxes fitxes, color color  ){
        
        switch(fitxes){
            case Peon:
               tauler[x][y].guardaFitxa((color == color.blanc)? new Peon(x,y,Peon.color.blanc):new Peon(x,y,Peon.color.negre));
            case Torre:
               tauler[x][y].guardaFitxa((color == color.blanc)? new Torre(x,y,Torre.color.blanc):new Torre(x,y,Torre.color.negre));
            case Alfil:
                tauler[x][y].guardaFitxa((color == color.blanc)? new Alfil(x,y,Alfil.color.blanc):new Alfil(x,y,Alfil.color.negre));
            case Cavall:
                tauler[x][y].guardaFitxa((color == color.blanc)? new Cavall(x,y,Cavall.color.blanc):new Cavall(x,y,Cavall.color.negre));
            case Reina:
                tauler[x][y].guardaFitxa((color == color.blanc)? new Reina(x,y,Reina.color.blanc):new Reina(x,y,Reina.color.negre));
            case Rei:
                tauler[x][y].guardaFitxa((color == color.blanc)? new Rei(x,y,Rei.color.blanc):new Rei(x,y,Rei.color.negre));
        }

        }
        
    
    
    public void generaAlgo(){
        for (int k =0; k<fil;k++){
            tauler[k][1].guardaFitxa(new Peon(k,1,Peon.color.blanc));
            tauler[k][6].guardaFitxa(new Peon(1,1,Peon.color.negre));
        }
        
    }
    
    
}
