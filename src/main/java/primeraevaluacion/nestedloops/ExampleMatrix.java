package primeraevaluacion.nestedloops;

import java.util.Scanner;

public class ExampleMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {

              System.out.print(i + "" + j + " ");

            }
            System.out.println();
        }

        System.out.println();

        System.out.print("Escribe el numero de filas: ");
        int fila = sc.nextInt();

        System.out.print("Escribe el numero de columnas: ");
        int columna = sc.nextInt();

        for (int i = 1; i <= fila; i++) {
            for (int j = 1; j <= columna; j++) {

                System.out.print(i + "" + j + " ");

            }
            System.out.println();
        }
    }
}
