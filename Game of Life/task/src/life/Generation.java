package life;

import java.util.ArrayList;

public class Generation extends Life {

    boolean[][] nextGeneration;
//    ArrayList<Boolean> neighbours = new ArrayList<>();
    boolean NW;
    boolean N;
    boolean NE;
    boolean E;
    boolean SE;
    boolean S;
    boolean SW;
    boolean W;

    public void simulateNextGeneration(){

        for (int i = 0; i < Number; i++){
            for (int j = 0; j < Number; j++){

                if ((i < 1 || i > Number - 2) || (j < 1 || j > Number - 2)) {



                } else {
                    NW = currentGeneration[i-1][j-1];
                    N = currentGeneration[i-1][j];
                    NE = currentGeneration[i-1][j+1];
                    E = currentGeneration[i][j+1];
                    SE = currentGeneration[i+1][j+1];
                    S = currentGeneration[i+1][j];
                    SW = currentGeneration[i+1][j-1];
                    W = currentGeneration[i][j-1];

                    int counter = 0;

                    if (NW){
                        counter++;
                    }
                    if (N){
                        counter++;
                    }
                    if (NE){
                        counter++;
                    }
                    if (E){
                        counter++;
                    }
                    if (SE){
                        counter++;
                    }
                    if (S){
                        counter++;
                    }
                    if (SW){
                        counter++;
                    }
                    if (W){
                        counter++;
                    }

                    nextGeneration[i][j] = (currentGeneration[i][j] && counter >= 2 && counter <= 3)
                                        || !currentGeneration[i][j] && counter == 3;

                }






            }
        }

    }

}
