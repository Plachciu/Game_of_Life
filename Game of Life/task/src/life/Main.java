package life;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Life life = new Life();
        life.getNumbers();
        life.mapCreator();
        life.mapFiller();
        life.mapPrinter();

    }
}
