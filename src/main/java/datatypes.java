public class datatypes {
    public static void main(String[] args) {

        // 8 primitiv datatype in JAVA
        // string is not a dataytype but an object from the class String
        // datatypes are signed--- from minus to positiv
        byte b = 10;         // 8  bytes
        short s = 1000;      // 16 bytes
        int ida = 1000000;   // 32 bytes --> equivilant to char
        long l = 10000000L;  // 64 bytes
        float fl = 0.1f;     // 32 bytes
        double d = 0.1;      // 64 bytes

        boolean bde = true ; // 1 byte
        char ct = 'p' ;      // --> equivilant to int

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

        // STring is an object
        String str = "Hello STZring";
        System.out.println("charAT: " + str.charAt(10));
        System.out.println(str);

    }

}
