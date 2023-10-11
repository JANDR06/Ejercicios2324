package primeraevaluacion.nestedloops;

import java.util.Scanner;

public class EjemploFuncion1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 1, num1 = 0, num2 = 0;

        do {

            menu();
            System.out.print("Option? ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Write number #1: ");
                num1 = sc.nextInt();

                if (opcion == 1 || opcion == 2) {
                    System.out.print("Write number #2: ");
                    num2 = sc.nextInt();
                }

                if (opcion == 1) {
                    System.out.println("The minimum is: " + numeroMenor(num1, num2));
                    System.out.println();

                } else if (opcion == 2) {

                    if (num1 > 0 && num2 > 0) {
                        gcd(num1, num2);

                    } else {
                        System.out.println("¡¡¡¡ NUMBER ERROR !!!!");
                    }

                } else if (opcion == 3) {
                    table(num1);
                    System.out.println();

                } else if (opcion == 4) {

                } else {

                }
            }


        } while (opcion != 0);

        System.out.println("Bye player! ");

    }

    public static void menu() {
        System.out.println("------------------------------------- MENU ------------------------------------- ");
        System.out.println();
        System.out.println("0 - Leave the program");
        System.out.println("1 - Calculate the minimum between two numbers");
        System.out.println("2 - Calculate GCD of two numbers (both must be > 0)");
        System.out.println("3 - Calculate the multiplicate table of a given number");
        System.out.println("4 - Calculate all prime numbers until a given number (must be > 0)");
        System.out.println("5 - Calculate the factorial numbers from 0 until a given number (must be >= 0)");
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------- ");
        System.out.println();
    }

    public static int numeroMenor (int a, int b) {

        if (a < b) {
            return a;
        }

        return b;
    }

    public static int gcd (int a, int b) {

        int numeroMinimo = numeroMenor(a, b);

        for (int i = 1; i < numeroMinimo; i++) {

        }

    }

    public static void table (int a) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(a +  " x " + i + " = " + a * i);
        }
    }
}
