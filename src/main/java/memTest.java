import java.util.Vector;

public class memTest {
    public static void main(String[] args) throws InterruptedException {
        Vector v = new Vector();
        while (true)
        {
            byte b[] = new byte[1048576];
           // byte b[] = new byte[100000];
            v.add(b);
            Runtime rt = Runtime.getRuntime();
            System.out.println( "free memory: " + rt.freeMemory() );
            Thread.sleep(10);
        }
    }
}
