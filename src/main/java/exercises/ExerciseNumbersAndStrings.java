package exercises;


import java.awt.font.GraphicAttribute;
import java.util.Random;

public class ExerciseNumbersAndStrings {
    /**
     * Adds a and b and returns the result
     */
    static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    /**
     * returns a number, where the digits of a and b are concatenated
     * Example: a = 123 (number)   b =  456 (number)
     * Result:  123456 (as a number)
     */
    static int concatDigits(int a, int b) {
       // int ret =  a.to + b;
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String s3 = s1 + s2;
        int ret = Integer.parseInt(s3);
        return ret;
       // throw new RuntimeException("not implemented");
    }

    /**
     * returns the number of digits of the number n
     * <p>
     * countDigits(0) -> 1
     * countDigits(123) -> 3
     */
    static int countDigits(int a) {
        int b = a;
       // return Math.abs(a);
        if ( a < 0 ) {
             b = a * -1 ;
        }
        System.out.println("digits: " + b);
        return (""+Math.abs(a)).length();
       //int length = String.valueOf(b).length();
       //return length;

//        throw new RuntimeException("not implemented");
    }

    /**
     * calculates the distance between (x1, y1) und (x2, y2)
     */
    static double distance(double x1, double y1, double x2, double y2) {
        //assertEquals(Math.sqrt(2), ExerciseNumbersAndStrings.distance(1, 1, 2, 2), 1e-5);
        double distX = x2 - x1;
        double distY = y2 - y1;
        double ret = java.lang.Math.sqrt((distX * distX ) + (distY * distY));

        System.out.println(ret);
        return  ret;
        //assertEquals(1, ExerciseNumbersAndStrings.distance(0, 1, 0, 0), 1e-5);
        //throw new RuntimeException("not implemented");

    }

    /**
     * rounds the float number x
     * <p>
     * round already exists - but as an exercise,
     * implement my_round without using round
     */
    static float myRound(float x) {
        return Math.round(x);
        //return int nr = (int)(x+0.5f)
//        throw new RuntimeException("not implemented");
    }

    /**
     * rounds the double number x
     * <p>
     * round already exists - but as an exercise,
     * implement my_round without using round
     */
    static double myRound(double x) {

        return Math.round(x);
     //   throw new RuntimeException("not implemented");
    }




    /**
     * return true if n is divisible by d
     * return false otherwise
     */
    static boolean isDivsible(int n, int d) {
        //return n % d ==0 ;
        if ( n % d == 0 ) {
            return true;
        } else
        {
            return false;
        }


        //throw new RuntimeException("not implemented");
    }

    /**
     * Return the greatest common divisor of a and b
     * Hint: Google for Euklidian algorithm
     */
    static int gcd(int a, int b) {
     //   assertEquals(4, ExerciseNumbersAndStrings.gcd(12,8));
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
       // throw new RuntimeException("not implemented");
    }

    /**
     * Convert degrees to radians ("Grad in Bodenmaß")
     */
    static double radians(double radians) {
        return radians /180 * Math.PI;
        //throw new RuntimeException("not implemented");
    }

    /**
     * checks if the distance between the
     * float numbers a and b is smaller than epsilon
     */
    static boolean closeEnough(double a, double b, double epsilon) {
        return Math.abs(a-b) < epsilon;
        //throw new RuntimeException("not implemented");
    }

    /**
     * returns the binary representation of n
     * <p>
     * binary(3) returns "11"
     * binary(16) returns "10000"
     * binary(15) returns "1111"
     */
    static String binary(int n) {

        //return Integer.toString(n,2);
        String ret = Integer.toBinaryString(n);
        System.out.println(ret);
        return  ret;
        //throw new RuntimeException("not implemented");
    }

    /**
     * throw a dice (return a random number from 1 to 6)
     * hint: look at Math.random or java.util.Random
     */
    static int dice() {
        return (int) (Math.random()*6 + 1 );
        //Random r = new Random();
        //int test = r.nextInt(6);
        //return test + 1;
      //  throw new RuntimeException("not implemented");
    }

    static int dice2() {
        Random r = new Random();
        int test = r.nextInt(6);
        return test + 1;
        //  throw new RuntimeException("not implemented");
    }
}