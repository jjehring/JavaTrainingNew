package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseLoops {

    /**
     * return the maximum of a and b
     *
     * (use an if statement, not any builtin functions)
     */
    static int max(int a, int b) {
        return Math.max(a,b);

/*        assertEquals(5, ExerciseLoops.max(3, 5));
        assertEquals(5, ExerciseLoops.max(5, 3));
        assertEquals(1, ExerciseLoops.max(0, 1));
        assertEquals(-3, ExerciseLoops.max(-3, 1-5));*/
    }

    /**
     * Return the number n as a string, but ...
     *
     * - if the number is divisble by 3, return "fizz" instead
     * - if the number is divisble by 5, return "buzz" instead
     * - if the number is divisble by 3 and 5, return "fizzbuzz" instead
     */
    static String fizzbuzz(int n) {

        if ( (n % 5 == 0) && (n % 3 == 0) )
        {
            return "fizzbuzz";
        } else if (n % 5 == 0) {
            return "buzz";
        } else if ( n % 3 == 0 ) {
            return "fizz";
        } else  {
            return Integer.toString(n);
        }


/*        assertEquals("1", ExerciseLoops.fizzbuzz(1));
        assertEquals("2", ExerciseLoops.fizzbuzz(2));
        assertEquals("fizz", ExerciseLoops.fizzbuzz(3));
        assertEquals("4", ExerciseLoops.fizzbuzz(4));
        assertEquals("buzz", ExerciseLoops.fizzbuzz(5));
        assertEquals("14", ExerciseLoops.fizzbuzz(14));
        assertEquals("fizzbuzz", ExerciseLoops.fizzbuzz(15));
        assertEquals("16", ExerciseLoops.fizzbuzz(16));*/

    }

    /**
     * Add up the numbers a, a+1, a+2, ..., b-1, b
     *
     * Example: summationWhile(3,6) = 3+4+5+6 = 18
     *
     * Use a while loop
     * return 0 if a > b
     */
    static int summationWhile(int a, int b) {
/*        assertEquals(3+4+5+6, ExerciseLoops.summationWhile(3,6));
        assertEquals(1+2+3+4+5+6+7, ExerciseLoops.summationWhile(1,7));
        assertEquals(0, ExerciseLoops.summationWhile(3,2));
        assertEquals(3, ExerciseLoops.summationWhile(3,3));
    */
        int loop = a;
        int sum = 0;
        while (loop <= b ) {
            sum = sum + loop;
            loop++;
        }
        return sum;

    }

    /**
     * Add up the numbers a, a+1, a+2, ..., b-1, b
     *
     * Example: summationFor(3,6) = 3+4+5+6 = 18
     *
     * Use a for loop
     * return 0 if a > b
     */
    static int summationFor(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            System.out.println("i: " + i);
            sum = sum + i;
            System.out.println("sum: " + sum);
        }
        return sum;
/*        assertEquals(3+4+5+6, ExerciseLoops.summationFor(3,6));
        assertEquals(1+2+3+4+5+6+7, ExerciseLoops.summationFor(1,7));
        assertEquals(0, ExerciseLoops.summationFor(3,2));
        assertEquals(3, ExerciseLoops.summationFor(3,3));*/


    }

    /**
     * Return true if c is a vowel (a,e,i,o,u), false otherwise
     */
    static boolean isVowel(char c) {
        throw new RuntimeException("not implemented");
    }

    /**
     * return the number of vowels in string s
     */
    static int countVowels(String s) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Test, if s is a palindrome:
     *
     * palindrome('otto') -> True
     * palindrome('anna') -> True
     * palindrome('abcba') -> True
     * palindrome('a') -> True
     * palindrome('') -> True
     *
     * palindrome('peter') -> False
     * palindrome('abcbb') -> False
     */
    static boolean palindrome(String s) {
        throw new RuntimeException("not implemented");
    }

    /**
     * Implement the following algorithm:
     * Start with number n.
     *
     * If the number is even, divide it by 2
     * If the number is odd, multiply by 3 and add 1
     * Repeat until you reach 1.
     * To keep track of the numbers you produce, create an empty list, and append
     * each new number to the list, including the first number n, and the last number 1
     * The function returns the resulting list of numbers
     *
     */
    static List<Integer> threeNPlusOne(int n) {
/*        assertEquals(Arrays.asList(3,10,5,16,8,4,2,1), ExerciseLoops.threeNPlusOne(3));
        assertEquals(Arrays.asList(4,2,1), ExerciseLoops.threeNPlusOne(4));
        assertEquals(Arrays.asList(1), ExerciseLoops.threeNPlusOne(1));
        assertEquals(Arrays.asList(7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16,8, 4, 2, 1), ExerciseLoops.threeNPlusOne(7));*/
        List<Integer> list = new ArrayList<Integer>();
        list.add(n);
        System.out.println(list.size());
        for (int i = n; i >= 1 ; i--) {
            System.out.println(i);
            if((i%2)==0) {
                list.add(i/2);
            } else {
                list.add(i * 3 + 1);
            }
        }
        list.add(1);


        return list;
    }
}
