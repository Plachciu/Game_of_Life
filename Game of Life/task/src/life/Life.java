package life;

import java.util.Random;
import java.util.Scanner;

public class Life {

    Scanner scanner = new Scanner(System.in);
    Random random;
    int Number = 0;
    int S = 0;

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public int getS() {
        return S;
    }

    public void setS(int s) {
        S = s;
    }

    boolean[][] currentGeneration;

    public void getNumbers (){
        this.Number = scanner.nextInt();
        this.S = scanner.nextInt();
    }

    public void mapCreator() {
        if (this.Number > 0) {
            this.currentGeneration = new boolean[this.Number][this.Number];
        } else {
            System.out.println("Wrong size of matrix!");
        }
    }

    public void mapFiller() {
        random = new Random(S);
        for (int i = 0; i < Number; i++){
            for (int j = 0; j < Number; j++){
                this.currentGeneration[i][j] = random.nextBoolean();
            }
        }

    }

    public void mapPrinter() {

        for (int i = 0; i < Number; i++){
            for (int j = 0; j < Number; j++){

                if (this.currentGeneration[i][j]){
                    System.out.print('O');
                } else {
                    System.out.print(' ');
                }
                if (j == Number - 1){
                    System.out.println();
                }
            }
        }

    }

}
