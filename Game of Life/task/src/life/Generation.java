//package life;
//
//import java.util.ArrayList;
//
//public class Generation extends Life {
//
//    boolean[][] nextGeneration;
////    ArrayList<Boolean> neighbours = new ArrayList<>();
//    boolean NW;
//    boolean N;
//    boolean NE;
//    boolean E;
//    boolean SE;
//    boolean S;
//    boolean SW;
//    boolean W;
//
//    public void simulateNextGeneration(){
//
//        int a;
//        int b;
//
//        for (int i = 0; i < Number; i++){
//            for (int j = 0; j < Number; j++){
//
//                if (i == 0 || i == Number - 1 || j == 0 || j == Number - 1) {
//
//                    a = i;
//                    b = j;
//
//                    if (i == 0) {
//                        a = Number - 1;
//                    }
//                    if (i == Number - 1){
//                        a = 0;
//                    }
//                    if (j == 0) {
//                        b = Number - 1;
//                    }
//                    if (j == Number - 1){
//                        b = 0;
//                    }
//
//                    NW = currentGeneration[i - 1][j - 1];
//                    N = currentGeneration[i - 1][j];
//                    NE = currentGeneration[i - 1][j + 1];
//                    E = currentGeneration[i][j + 1];
//                    SE = currentGeneration[i + 1][j + 1];
//                    S = currentGeneration[i + 1][j];
//                    SW = currentGeneration[i + 1][j - 1];
//                    W = currentGeneration[i][j - 1];
//
//
//                } else {
//                    NW = currentGeneration[i - 1][j - 1];
//                    N = currentGeneration[i - 1][j];
//                    NE = currentGeneration[i - 1][j + 1];
//                    E = currentGeneration[i][j + 1];
//                    SE = currentGeneration[i + 1][j + 1];
//                    S = currentGeneration[i + 1][j];
//                    SW = currentGeneration[i + 1][j - 1];
//                    W = currentGeneration[i][j - 1];
//                }
//
//                    int counter = 0;
//
//                    if (NW){
//                        counter++;
//                    }
//                    if (N){
//                        counter++;
//                    }
//                    if (NE){
//                        counter++;
//                    }
//                    if (E){
//                        counter++;
//                    }
//                    if (SE){
//                        counter++;
//                    }
//                    if (S){
//                        counter++;
//                    }
//                    if (SW){
//                        counter++;
//                    }
//                    if (W){
//                        counter++;
//                    }
//
//                    nextGeneration[i][j] = (currentGeneration[i][j] && counter >= 2 && counter <= 3)
//                                        || !currentGeneration[i][j] && counter == 3;
//
//            }
//        }
//
//    }
//
//}
