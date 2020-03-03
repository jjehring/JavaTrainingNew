import java.util.Random;
import java.util.Scanner;

// User input
public class inputRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int myRandInt = r.nextInt(10);
        Scanner s = new Scanner(System.in);
        System.out.println("das wäre richtig: " + myRandInt);
        int inputNo;
        int count = 0;

        while (true) {
            count++;
            System.out.println("Viel Spass beim Raten: ...");
            System.out.println("Versuch: " + count );
            inputNo = s.nextInt();
            System.out.println("danke für deinen Input: " + inputNo);
            if (inputNo == myRandInt) {
                System.out.println("Yeah, correct.. Im " + count + " Versuch");
                break;
            } else if (inputNo < myRandInt) {
                System.out.println("Sorry, etwas größer beim nächsten mal nochmal bitte ...");
            } else if ((inputNo > myRandInt))  {
                System.out.println("Sorry, etwas kleiner beim nächsten mal nochmal bitte ...");
            }
        }
    }

}


