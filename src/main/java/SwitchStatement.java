public class SwitchStatement {
    public static void main(String[] args) {
        int dice =  (int)(Math.random()*6 + 1);
        System.out.println("dice: " + dice);
        switch (dice) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            default:
                System.out.println("anything else");

        }


    }
}


