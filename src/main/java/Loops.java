public class Loops {
    public static void main(String[] args) {
       int i = 10;
       while (i > 0) {
           System.out.println(i);
           i--;
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           //i -= 1;
       }

/*       for (int b = i; b <= i; b--) {
            System.out.println(b);
       }*/
        i = 10;
        while (true) {
            System.out.println(i);
            i = i -1;
            if (i < 2) break;
        }
    }
}


