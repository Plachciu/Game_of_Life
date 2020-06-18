package life;

import java.util.Random;
import java.util.Scanner;

public class Life {

    Scanner scanner = new Scanner(System.in);
    Random random;
    int N = 0;
    int S = 0;
    boolean[][] map;

    public void getNumbers (){
        this.N = scanner.nextInt();
        this.S = scanner.nextInt();
    }

    public void mapCreator() {
        if (this.N > 0) {
            this.map = new boolean[this.N][this.N];
        } else {
            System.out.println("Wrong size of matrix!");
        }
    }

    public void mapFiller() {
        random = new Random(S);
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                this.map[i][j] = random.nextBoolean();
            }
        }

    }

    public void mapPrinter() {

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){

                if (this.map[i][j]){
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
