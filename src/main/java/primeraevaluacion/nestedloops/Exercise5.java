package primeraevaluacion.nestedloops;

/*
5. Cree un programa que muestre un contador de 5 dígitos (XXXXX), que muestre el
números del 0-0-0-0-0 al 9-9-9-9-9, con la particularidad de que cada vez que sale un 3
parece reemplazarlo con una E
 */

public class Exercise5 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {

                    if (j == 4 && i!= 3) {
                        System.out.print(i);
                    } else if (j == 4) {
                        System.out.print("E");
                    } else {

                        if (i == 3) {
                            System.out.print("E-");
                        } else {
                            System.out.print(i + "-");
                        }
                    }
            }

            System.out.println();
        }
    }
}
