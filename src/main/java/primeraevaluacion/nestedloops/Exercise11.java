package primeraevaluacion.nestedloops;

import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero para tu piramide matriz: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();


        }
    }
}
