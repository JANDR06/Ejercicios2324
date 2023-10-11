package primeraevaluacion.nestedloops;

/*
12. Introduzca un menú en el programa anterior para permitir al usuario elegir si el
El vértice de la pirámide apunta hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 */

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        int altura = elgirTamanyo();
        System.out.println();

        System.out.println("------ TRIANGULO 1 ------");
        triangulo1(altura);
        System.out.println();

        System.out.println("------ TRIANGULO 2 ------");
        triangulo2(altura);
        System.out.println();

        System.out.println("------ TRIANGULO 3 ------");
        triangulo3(altura);
        System.out.println();

        System.out.println("------ TRIANGULO 4 ------");
        triangulo4(altura);
        System.out.println();

        int numero = elgirNumero();

        if (numero == 1) {
            triangulo1(altura);
        } else if (numero == 2) {
            triangulo2(altura);
        } else if (numero == 3) {
            triangulo3(altura);
        } else {
            triangulo4(altura);
        }
    }

    public static void triangulo1 (int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = altura; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangulo2 (int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangulo3 (int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = altura; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangulo4 (int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = i; j <= altura; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int elgirNumero() {
        Scanner sc = scanner();

        int num;

        do {
            System.out.print("¿Con que triangulo te quedas (1 - 4)? ");
            num = sc.nextInt();

        } while (num < 1 || num > 4);

        return num;
    }

    public static int elgirTamanyo() {
        Scanner sc = scanner();

        int tamanyo;

        do {
            System.out.print("¿Altura del triangulo (1 - 99)? ");
            tamanyo = sc.nextInt();

        } while (tamanyo < 1 || tamanyo > 99);

        return tamanyo;
    }

    public static Scanner scanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

}
