package life;

import java.util.Random;
import java.util.Scanner;

public class Life {

    Scanner scanner = new Scanner(System.in);
    Random random;
    int N = 0;
    int S = 0;
    int generations = 0;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    boolean[][] currentGeneration;

    public void getNumbers (){
        this.N = scanner.nextInt();
        this.S = scanner.nextInt();
        this.generations = scanner.nextInt();
    }

    public void mapCreator() {
        if (this.N > 0) {
            this.currentGeneration = new boolean[this.N][this.N];
        } else {
            System.out.println("Wrong size of matrix!");
        }
    }

    public void mapFiller() {
        random = new Random(S);
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                this.currentGeneration[i][j] = random.nextBoolean();
            }
        }

    }

    public void mapPrinter() {

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){

                if (this.currentGeneration[i][j]){
                    System.out.print('O');
                } else {
                    System.out.print(' ');
                }
                if (j == N - 1){
                    System.out.println();
                }
            }
        }

    }

}
