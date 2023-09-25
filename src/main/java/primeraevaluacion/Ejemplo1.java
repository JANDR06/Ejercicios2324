/*
1. Introducir tres números y decir cual es mayor, cual menor y cual el del medio.
 */

package primeraevaluacion;

import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Escribe el segundo numero: ");
        int numero2 = sc.nextInt();

        System.out.print("Escribe el tercer numero: ");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
            System.out.println("El mayor es: " + numero1);
            System.out.println("El del medio es: " + numero2);
            System.out.println("El pequeño es: " + numero3);

        } else if (numero2 < numero3) {
            System.out.println("El mayor es: " + numero1);
            System.out.println("El del medio es: " + numero3);
            System.out.println("El pequeño es: " + numero2);
        }

        if (numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
            System.out.println("El mayor es: " + numero2);
            System.out.println("El del medio es: " + numero1);
            System.out.println("El pequeño es: " + numero3);

        } else if (numero1 < numero3) {
            System.out.println("El mayor es: " + numero2);
            System.out.println("El del medio es: " + numero3);
            System.out.println("El pequeño es: " + numero1);
        }

        if (numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
            System.out.println("El mayor es: " + numero3);
            System.out.println("El del medio es: " + numero1);
            System.out.println("El pequeño es: " + numero2);

        } else if (numero1 < numero2) {
            System.out.println("El mayor es: " + numero3);
            System.out.println("El del medio es: " + numero2);
            System.out.println("El pequeño es: " + numero1);
        }

    }
}
