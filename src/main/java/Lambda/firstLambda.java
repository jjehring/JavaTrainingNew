package Lambda;

public class firstLambda {

    public static void hello() {
        System.out.println("hello");
    }

    public static void twice(Runnable code) {
        code.run();code.run();
    }

    public static void main(String[] args) {
        //Runnable r = () -> System.out.println("hello");
        Runnable r = firstLambda::hello;
        twice(r);
        //twice(firstLambda::hello);

    }
}
