import java.util.Random;
import java.util.Scanner;

public class arrayClass {
    public static void main(String[] args) {
        int[] table = new int[100000];
        for (int i = 0; i <= table.length - 1; i++) {
            Random r = new Random();
            table[i] =  r.nextInt(1000);
            System.out.println("Initialize array: " + table[i]);
        }
/*        table[0] = 100;
        table[1] = 1000;
        table[2] = 10000;*/
        for (int i = 0; i <= table.length - 1; i++) {
            System.out.println("PrintOut array: " + table[i]);
        }

      /*  Scanner s = new Scanner(System.in);
        int[] scores = new int[];
        int counter = 0 ;
        while (counter < 0 ) {
            int input = s.nextInt();
            if (input == -1) {
                break;
            } else {
                scores[counter] =  input;
                counter++;
            }
        }*/


    }
}
