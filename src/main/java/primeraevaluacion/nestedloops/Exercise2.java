package primeraevaluacion.nestedloops;

/*
2. Crea un programa que, dada la cadena «\|@#~€¬!»·$%&/()=», indique si hay otro
la cadena proporcionada por el usuario contiene cualquiera de esos caracteres. (Sí o no).
 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena = "\\\\|@#~€¬!»·$%&/()=", cadenaUsuario;
        boolean coincide = false;

        System.out.print("Escribe una cadena: ");
        cadenaUsuario = sc.next();

        for (int i = 0; i < cadenaUsuario.length(); i++) {
            for (int j = 0; j < cadena.length(); j++) {

                if (cadenaUsuario.charAt(i) == cadena.charAt(j)) {
                    coincide = true;
                }
            }
        }

        if (coincide == true) {
            System.out.println("Al menos un caracter coincide con la cadena especial");
        } else {
            System.out.println("Ningun caracter coincide con la cadena especial");
        }

    }
}
