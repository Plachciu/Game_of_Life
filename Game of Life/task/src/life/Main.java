package life;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int generations = scanner.nextInt();

        GameBoard game = new GameBoard(N, S);
        game.calculateGenerations(generations);
        game.print();









//        Life life = new Life();
//        CalcValue calcValue = new CalcValue();
//        calcValue.getNumbers();
//        calcValue.mapCreator();
//        calcValue.mapFiller();
//        calcValue.simulateNextGeneration();
//        calcValue.mapPrinter();

    }
}
