package primeraevaluacion.nestedloops;

public class Exercise1{

    public static void main(String[] args){

        for (int i = 2; i <= 100; i++){
            boolean primo = true;
            int j = i - 1;

            while (j >= 2 && primo){
                if (i % j == 0){
                    primo = false;
                }
                j--;
            }

            if (primo){
                System.out.print(" " + i);
            }

        }
        System.out.println("");

    }
}
