import java.util.Random;

public class methods {
    public static void main(String[] args) {
            // Calling functions
            greetingPart1();
            greetingPart2();
            RepetetionDay1.greetingPart2(); // call method from other class
        }

// functions or methods in Java
// void means there is NO return
        public static void greetingPart1()
        {
            System.out.println("hello1");
            System.out.println("hello2");
            Random r = new Random();
            int myRand = r.nextInt(100);
            System.out.println("my rand: " + myRand);
        }
        public static void greetingPart2()
        {
            System.out.println("hello3");
            System.out.println("hello4");
        }

        public static void greeting(String name)
        {
            System.out.println("hello " + name );
            System.out.println("hello " + name + " wie geht es dir? ");
        }
        // Methode überladen
        public static void greeting(String fistname, String nachname)
        {
            System.out.println("hello " + fistname + " " + nachname );
        }

        public static void square (int i )
        {
            System.out.println(i*i);
        }
}
