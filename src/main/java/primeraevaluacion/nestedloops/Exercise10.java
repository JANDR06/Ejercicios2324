package primeraevaluacion.nestedloops;

/*
10. Escribe un programa que pinte una pirámide llena de un carácter ingresado por el teclado.
podría ser una letra, un número o un símbolo como *, +, -, $, &, etc...
#
###
#####
#######
#########
 */

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el numero de filas de tu escalera: ");
        int filas = sc.nextInt();

        System.out.print("Escribe el caracter para formar la escalera: ");
        char caracter = sc.next().charAt(0);

        for (int i = 1; i <=  filas; i++) {
            for (int j = 1; j <= i + (i - 1); j++) {

                System.out.print(caracter);
            }

            System.out.println();
        }
    }
}
