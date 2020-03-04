package object;

public class callPerson {

    public static void main(String[] args) {
        String name = "hans";
        int nr = 123123123;
        Person pers = new Person("hans","müller");

        pers.nr = 12312312;
        pers.plz = 45711;
        pers.printPerson();
        String fulli = pers.fullName();
        System.out.println("My full name: " + fulli);
        System.out.println(pers.getFirstName());
       // System.out.println(pers.getLastName();
       // System.out.println(pers.plz);
        pers.setFirstName("heinz");


    }
}


