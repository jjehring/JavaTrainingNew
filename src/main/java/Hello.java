import java.util.Random;
public class Hello {
    public static void main (String [] args) {
        System.out.println("Hello Test again");

        System.out.println("Test nextswwwwwss ");
        for (int i = 0; i <= 5; i++) {
            System.out.println( "Test: " + i );
            if (i > 10 && i < 20) {
                System.out.println("bin im If von Thorsten" + i);
            }
        }

        System.out.println(2 + 5);
        System.out.println(5-3);
        System.out.println(5*3);
        System.out.println(5/2);

        int average = (3+4+5)/3;
        System.out.println("meine erste VAr: " + average  );

        Random r = new Random();
        System.out.println(r.nextInt(1000));


    }
}


