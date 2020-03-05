package Lambda;

public class secLambda {

    public static void hello() {
        System.out.println("hello");
    }

    public static void twice(Runnable code) {
        code.run();code.run();
    }

    public static void main(String[] args) {
        //Runnable r = () -> System.out.println("hello");
        Runnable r = secLambda::hello;
        twice(r);
        //twice(firstLambda::hello);

    }
}
