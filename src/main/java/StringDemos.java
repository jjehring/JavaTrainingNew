public class StringDemos {
    public static void main(String[] args) {

       // STring is an object
        String str = "Hello STZring";
        System.out.println("charAT: " + str.charAt(10));
        System.out.println(str);

        String s = "some text";
        String s2 = "some more text";
        String month = "March is a very nice Month";

        System.out.println(s + " " +  s2); // String concat
        System.out.println("lenght s: " + s.length()); // String methods
        System.out.println("Method on s: " + s.replace('o','Ä')); // String methods
        String str2 =  month.replaceAll("March","Märtsch");
        str2 =  str2.replaceAll("Month","Montt");
        System.out.println(month) ; // String methods
        System.out.println(str2) ; // String methods

        System.out.println(str2.lastIndexOf('M'));
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        System.out.println(1+1);
        System.out.println("1"+1);

        String sup = "1234";
        int i = Integer.parseInt(sup);
        System.out.println(i);
        String supi = "1234.38";
        double id = Double.parseDouble(supi);
        System.out.println(id);


    }

}
