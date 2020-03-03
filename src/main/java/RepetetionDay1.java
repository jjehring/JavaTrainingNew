
//import interface
// Repetition firstDay
public class RepetetionDay1 {
    public static void main (String [] args) {
        System.out.println("Hello Test again");
        System.out.println("Test nextswwwwwss ");
        for (int i = 0; i <= 5; i++) {
            System.out.println( "Test: " + i );
        }

        // Do NOT compare doubles and floats
        System.out.println(0.1 + 0.2 == 0.3); // float können so nicht berechnet werden, da
        System.out.println(Math.abs(0.1 + 0.2 - 0.3) < 0.0000001);

        System.out.println("test" == "test"); // Do not DO
        String test = "test";
        System.out.println(test.equals("test"));

        // Calling functions
        greetingPart1();
        greetingPart2();
    }


// functions or methods in Java
    // void means there is NO return
    public static void greetingPart1()
    {
        System.out.println("hello1 from Repetion");
        System.out.println("hello2 from Repetion");
    }
    public static void greetingPart2()
    {
        System.out.println("hello3 from Repetion");
        System.out.println("hello4 from Repetion");
    }
}