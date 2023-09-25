/*
2. El usuario introduce una palabra de 4 letras. Sólo se tiene en cuenta las palabras de 4 letras,
sino acabar. Decir, si la palabra de 4 letras es o no capicua
 */

package primeraevaluacion;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe unicamente una palabra de 4 letras: ");
        String palabra = sc.next();

        while (palabra.length() == 4) {

            if (palabra.charAt(0) == palabra.charAt(3) && palabra.charAt(1) == palabra.charAt(2)) {
                System.out.println("La palabra escrita es capicua");

            } else {
                System.out.println("La palabra escrita no es capicua");
            }

            System.out.print("Escribe unicamente una palabra de 4 letras: ");
            palabra = sc.next();

        }

    }
}

