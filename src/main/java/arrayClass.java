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

        // Multidimensional Arrays
        int [][] square = {
                {16,3,2,13},   // row 0
                {5,10,11,8},   // row 1
                {9,6,7,12},
                {4,15,14,1}
        };
        System.out.println(square[2][2]);
        for ( int i = 0 ; i< square.length ; i++)
        {
            System.out.println("row " + square[i]);
            for ( int a = 0 ; a< square.length ; a++) {
                System.out.println(square[i][a]);
            }

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
