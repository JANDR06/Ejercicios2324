package primeraevaluacion.nestedloops;

/*
7. Cree un programa que lea un número entero (altura) y a partir de él cree un número invertido
escalera de asteriscos con esa altura. Debería verse así, si ponemos una altura de 5.
*****
****
***
**
*
 */

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Altura de la escalera invertida? ");
        int altura = sc.nextInt();
        int aux = altura;

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= aux ; j++) {
                System.out.print("* ");

            }

            System.out.println();
            aux--;
        }

        System.out.print("¿Altura de la escalera clasica? ");
        int alturaClas = sc.nextInt();
        int auxClas = 1;

        for (int i = 1; i <= alturaClas; i++) {
            for (int j = 1; j <= auxClas; j++) {

                System.out.print("* ");
            }

            System.out.println();
            auxClas++;

        }
    }
}
