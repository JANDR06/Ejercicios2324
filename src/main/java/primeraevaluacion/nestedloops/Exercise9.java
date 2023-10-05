package primeraevaluacion.nestedloops;

import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Tamaño del rombo? ");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {

            for (int j = size - i; j >= 1; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i + (i - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

        for (int i = 1; i <= size - 1; i++) {

            for (int j = i; j <= i + (i - 1); j++) {
                System.out.print("  ");
            }

            for (int j = i + (i + 1); j <= size + (size - 1); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
