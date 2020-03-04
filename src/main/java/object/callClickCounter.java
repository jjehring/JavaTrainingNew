package object;

public class callClickCounter {
    public static void main(String[] args) {
        clickCounter cli = new clickCounter();
        clickCounter cli2 = new clickCounter();
        cli.upCounter();cli2.upCounter();cli.upCounter();cli2.upCounter();cli.upCounter();cli2.upCounter();
        System.out.println(cli.getClickCounter());
        cli.upCounter();
        System.out.println(cli.getClickCounter());
        cli.resetClickCounter();
        System.out.println(cli.getClickCounter());
        cli.upCounter();
        System.out.println(cli.getClickCounter());
        cli.upCounter();
        System.out.println(cli.getClickCounter());
        cli.upCounter();
        System.out.println(cli.getClickCounter());
        cli.upCounter();
        System.out.println(cli.getClickCounter());

    }
}
