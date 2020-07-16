package life;

public class CalcValue extends Life{


    boolean[][] nextGeneration;
    int x;
    int y;
    int i;
    int j;

    public void simulateNextGeneration(){
        for (int x = 0; x < N - 1; x++) {
            for (int y = 0; y < N - 1; y++) {
                calcValue();
            }
        }
    }



    public boolean calcValue() {
        int alive = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (!(x ==0) && !(y ==0)){
                    if (read(i,j,x,y)){
                        alive += 1;
                    }
                }
            }
        }

        return nextGeneration[i][j] = (currentGeneration[i][j] && alive >= 2 && alive <= 3)
                                       || !currentGeneration[i][j] && alive == 3;
    }


    private boolean read (int i, int j, int x, int y){

        int indexX = (x + i + N)% N;
        int indexY = (y + j + N)% N;
        return currentGeneration[indexX][indexY];
    }


}
