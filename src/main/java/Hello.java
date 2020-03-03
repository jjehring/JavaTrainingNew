import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Random;
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Test again");

        System.out.println("Test nextswwwwwss ");
        for (int i = 0; i <= 30; i++) {
            System.out.println("Test: " + i);
            if (i > 10 && i < 20) {
                System.out.println("bin im If von Thorsten" + i);
            }
        }

        System.out.println(2 + 5);
        System.out.println(5 - 3);
        System.out.println(5 * 3);
        System.out.println(5 / 2);

        int average = (3 + 4 + 5) / 3;
        System.out.println("meine erste VAr: " + average + 1);

        Random r = new Random();
        int randvar = 0;
        int count = 0;
        while (randvar != 9) {
            randvar = r.nextInt(10);
            System.out.println("random:" + randvar);
            System.out.println("durchlauf:" + count);
            count++;
        }


        // datatypes
        float f = 5.5f;
        double temperatur = 5.5;

        // print the temperature in Fahrenheit
        // (0 °C × 9/5) + 32/
        double fahrenheit =   9 / 5 * temperatur + 32;  // falsch, da 9/5 als integer berechnet wird und 1 ist --> 37,5
        System.out.println("WRONG fahrenheit: " + fahrenheit);
        fahrenheit =  9.0 / 5.0 * temperatur + 32; // richtig, da 9.0/50. als double berechnet wird --> 41,9
        System.out.println("fahrenheit: " + fahrenheit);

        byte b = 10 ;
        short s = 1000;
        int i = 10000;
        long l = 10000000000000L;

        short x = b; // byte fis into short
        // short y = i; // --> error int to big for short

        // Typecasting
        int z = (int) l; // --> 1316134912
        System.out.println(z);  // long l is too big for int --> data loss

        byte t = (byte) s; // typecast casting a short into byte... bytes werden abgeschnitten
        System.out.println("byte: " + t);

        int test = 7;
        String testSTri = Integer.toBinaryString(test);
        System.out.println(testSTri);



    }
}


