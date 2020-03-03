import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

// User input
public class inputRandomGui {
    public static void main(String[] args) {
        Random r = new Random();
        int myRandInt = r.nextInt(10);
        Scanner s = new Scanner(System.in);
        System.out.println("das wäre richtig: " + myRandInt);
        int inputNo = 0 ;
        int count = 0;
        String message = "Starting .. Please type a number ";

        while (true) {
            count++;
            System.out.println("Viel Spass beim Raten: ...");
            System.out.println("Versuch: " + count );
            inputNo = gui(inputNo,message);
            System.out.println("danke für deinen Input: " + inputNo);
            if (inputNo == myRandInt) {
                message = "Success"; // System.out.println("Yeah, correct.. Im " + count + " Versuch");
                JOptionPane.showMessageDialog(null, "You were right : " + myRandInt + ":" + inputNo , "" + message, JOptionPane.PLAIN_MESSAGE );
                break;
            } else if (inputNo < myRandInt) {
                message = "Sorry, etwas größer beim nächsten mal nochmal bitte ..."; //System.out.println("Sorry, etwas größer beim nächsten mal nochmal bitte ...");
                JOptionPane.showMessageDialog(null, "the last Input was : " + inputNo , "" + message, JOptionPane.PLAIN_MESSAGE );
            } else if ((inputNo > myRandInt))  {
                message = "Sorry, etwas kleiner beim nächsten mal nochmal bitte ...";
                JOptionPane.showMessageDialog(null, "the last Input was : " + inputNo , "" + message, JOptionPane.PLAIN_MESSAGE );
                //System.out.println("Sorry, etwas kleiner beim nächsten mal nochmal bitte ...");
            }
        }
    }

    public static int gui(int lastInput, String message)
    {
        //    System.out.println("hello " + name );
         //   System.out.println("hello " + name + " wie geht es dir? ");

        String num1, num2;
        int number1, number2, sum;
        num1 = JOptionPane.showInputDialog(message);
        number1 = Integer.parseInt(num1);
       // JOptionPane.showMessageDialog(null, "the sum is : " + sum , "Results", JOptionPane.PLAIN_MESSAGE );
        return number1;
    }



}


