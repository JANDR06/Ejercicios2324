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

        System.out.print("¿Caracter para rellenar la escalera clasica? ");
        char caracter = sc.next().charAt(0);
        int auxClas = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= auxClas; j++) {

                System.out.print(caracter + " ");
            }

            System.out.println();
            auxClas++;

        }
    }
}
