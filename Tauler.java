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

    enum color {
        blanc, negre
    };

    enum selFitxes {
        Peon, Alfil, Torre, Cavall, Rei, Reina
    };

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

    public void creaFitxes(int x, int y, selFitxes fitxes, color color) {

        switch (fitxes) {
            case Peon:
                tauler[x][y].guardaFitxa((color == color.blanc) ? new Peon(x, y, Peon.color.blanc) : new Peon(x, y, Peon.color.negre));
            case Torre:
                tauler[x][y].guardaFitxa((color == color.blanc) ? new Torre(x, y, Torre.color.blanc) : new Torre(x, y, Torre.color.negre));
            case Alfil:
                tauler[x][y].guardaFitxa((color == color.blanc) ? new Alfil(x, y, Alfil.color.blanc) : new Alfil(x, y, Alfil.color.negre));
            case Cavall:
                tauler[x][y].guardaFitxa((color == color.blanc) ? new Cavall(x, y, Cavall.color.blanc) : new Cavall(x, y, Cavall.color.negre));
            case Reina:
                tauler[x][y].guardaFitxa((color == color.blanc) ? new Reina(x, y, Reina.color.blanc) : new Reina(x, y, Reina.color.negre));
            case Rei:
                tauler[x][y].guardaFitxa((color == color.blanc) ? new Rei(x, y, Rei.color.blanc) : new Rei(x, y, Rei.color.negre));
        }

    }

    public void generaAlgo() {

        for (int y = 0; y < fil; y++) {
            for (int x = 0; x < col; x++) {
                if (y == 0){
                    if ((x==0) || (x==7)){
                        tauler[x][y].guardaFitxa(new Torre(x, y, Fitxa.color.blanc));
                    }
                    if ((x==1)||(x==6)){
                        tauler[x][y].guardaFitxa(new Cavall(x, y, Fitxa.color.blanc));
                    }
                    if ((x == 2)|| (x==5)){
                        tauler[x][y].guardaFitxa(new Alfil(x, y, Fitxa.color.blanc));
                    }
                    if (x==3){
                        tauler[x][y].guardaFitxa(new Rei(x, y, Fitxa.color.blanc));
                    }
                    if (x==4){
                        tauler[x][y].guardaFitxa(new Reina(x, y, Fitxa.color.blanc));
                    }
                }
                if (y==7){
                    if ((x==0) || (x==7)){
                        tauler[x][y].guardaFitxa(new Torre(x, y, Fitxa.color.negre));
                    }
                    if ((x==1)||(x==6)){
                        tauler[x][y].guardaFitxa(new Cavall(x, y, Fitxa.color.negre));
                    }
                    if ((x == 2)|| (x==5)){
                        tauler[x][y].guardaFitxa(new Alfil(x, y, Fitxa.color.negre));
                    }
                    if (x==3){
                        tauler[x][y].guardaFitxa(new Rei(x, y, Fitxa.color.negre));
                    }
                    if (x==4){
                        tauler[x][y].guardaFitxa(new Reina(x, y, Fitxa.color.negre));
                    }
                }
                if (y == 1){
                    tauler[x][y].guardaFitxa(new Peon(x, y, Fitxa.color.blanc));
                    }
                if (y == 6){
                    tauler[x][y].guardaFitxa(new Peon(x, y, Fitxa.color.negre));
                    }
                    
                

            }

        }
    }
}
