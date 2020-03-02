public class datatypes {
    public static void main(String[] args) {

        // 8 primitiv datatype in JAVA
        // string is not a dataytype but an object
        byte b = 10;
        short s = 1000;
        int ida = 1000000;
        long l = 10000000L;
        float fl = 0.1f;
        double d = 0.1;

        boolean bde = true ;
        char ct = 'p' ;
        //


        // CHAR
        char c = 'A';
        int i = c;
        System.out.println(c);
        System.out.println(i);

        // Boolean
        boolean boo = true;
        System.out.println(boo);

        // logical operators
        // AND  &&
        boolean productCheap = true;
        boolean productGood = true;
        boolean bargain = productCheap && productGood; // returns true if both are true, otherwise false
        System.out.println(bargain);

        // OR ||
        boolean stillWorthBuying = productCheap || productGood;
        System.out.println(stillWorthBuying);

    }

}
