package primeraevaluacion.nestedloops;

/*
6. Cree un programa que lea un número entero (lado) y a partir de él cree un cuadrado de
asteriscos de ese tamaño. Los asteriscos sólo serán visibles en el borde del cuadrado, no
adentro. Por ejemplo, con el lado 5:
* * * * *
*       *
*       *
*       *
* * * * *
 */

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Anchura del cuadrado? ");
        int anchura = sc.nextInt();

        for (int i = 1; i <= anchura; i++) {
            for (int j = 1; j <= anchura; j++) {

                if (i == 1 || j == 1 || i == anchura || j == anchura) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
