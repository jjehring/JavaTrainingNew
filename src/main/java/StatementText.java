import java.util.Random;

public class StatementText {
    public static void main(String[] args) {
        double r = Math.random();
        double c = 0.5;
        double d = 0.7;
        if (r > c) {
            System.out.println("random number larger than: " + c + " : " + r);
        } else {
            System.out.println("random number smaller than: " + c + " : " + r);
        }

        if (r > d) {
            System.out.println("random number larger than: " + c + " : " + r);
        } else if (r > d) {
            System.out.println("random number smaller than: " + d + " : " + r);
        }
            else {
                System.out.println("nothing");
            }
        }
    }



