package life;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class GameBoard {

    private boolean[][] fields;

    GameBoard(int N, int S) {
        this.fields = new boolean[N][N];
        Random random = new Random(S);
        BiConsumer<Integer, Integer> randomizeField = (i, j) -> {
            this.fields[i][j] = random.nextBoolean();
        };
        iterateOverFields(randomizeField);


    }

    public void print() {
        for (int i = 0; i < fields.length; i++){
            for (int j = 0; j < fields[i].length; j++){

                if (this.fields[i][j]){
                    System.out.print('O');
                } else {
                    System.out.print(' ');
                }
                if (j == fields.length - 1){
                    System.out.println();
                }
            }
        }
    }

    private void iterateOverFields(BiConsumer<Integer, Integer> consumer){
        for(int x = 0; x < fields.length; x++){
            for(int y = 0; y < fields[x].length; y++){
                consumer.accept(x, y);
            }
        }
    }

    private void calculateNextGeneration(){
        boolean[][] nextGeneration = new boolean[fields.length][fields[0].length];
        BiConsumer<Integer,Integer> nextValue = (i, j) -> {
            nextGeneration[i][j] = calculateCell(i, j);
        };

        iterateOverFields(nextValue);
        this.fields = nextGeneration;
    }

    private boolean calculateCell(Integer i, Integer j) {
        int alive = 0;
        for (int x = -1; x < 2; x++){
            for (int y = -1; y < 2; y++){
                if (!(x==0 && y==0)){
                    if (read(i,j,x,y)){
                        alive += 1;
                    }
                }
            }
        }
//        System.out.println(alive);
        return (fields[i][j] && alive >= 2 && alive <= 3) || !fields[i][j] && alive == 3;
    }

    private boolean read (int i, int j, int x, int y){
        int N = fields.length;
        int N1 = fields[0].length;
        int indexX = (x + i + N)% N;
        int indexY = (y + j + N1)% N1;
        return fields[indexX][indexY];
    }

    public void calculateGenerations(int generations) {
        for (int loop = 0; loop < generations; loop++){
            calculateNextGeneration();
        }
    }



}
