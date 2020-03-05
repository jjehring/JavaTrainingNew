package object;

class Person2 {
    private String firstName = "max";
    private String lastName = "mustermann";
    int nr = 99;
    int plz = 1111;

    // constructor   Mandatory attributes for an object of this class
    // now an object cannot be created without giving the basic parameters
    // recommend: Always write a constructor
    public Person2(String initalFirstName, String initialLastName) {
        firstName = initalFirstName;
        lastName = initialLastName;
        // instance Method, call
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person2 {
    double salara;
    int employed;

    public Employee(String initalFirstName, String initialLastName, double salara, int employed) {
        super(initalFirstName, initialLastName);
        this.salara = salara;
        this.employed = employed;
    }

    public double getSalara() {
        return salara;
    }

    public int getEmployed() {
        return employed;
    }
}

// ------------------------------------------
    public class Recap {
        public static void main(String[] args) {
            Person2 p = new Employee("Anna","muster", 1000, 2000);
            Person2 po = new Person2("gunnar", "blöäd");
            System.out.println(p.getFirstName() + ":" + p.getLastName() + "" + ((Employee) p).getEmployed());

        }

    }


