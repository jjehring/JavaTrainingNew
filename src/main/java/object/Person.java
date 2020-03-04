package object;

public class Person {
    private String firstName ="max";
    private String lastName= "mustermann";
     int nr =99;
     int plz = 1111;

    // constructor   Mandatory attributes for an object of this class
    // now an object cannot be created without giving the basic parameters
    // recommend: Always write a constructor
    public Person( String initalFirstName, String initialLastName) {
        firstName = initalFirstName;
        lastName = initialLastName;
        // instance Method, call
    }

    void printPerson() {  // void just says it a method without return
        System.out.println("I am a person object\n");
        System.out.println("My name is: " + firstName);
        System.out.println("My number is: " + nr);
        System.out.println("My PLZ is: " + plz);
    }

    // instance Method, call
    String fullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNr() {
        return nr;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }


}


