import java.awt.*;
import java.applet.Applet.*;
public class testLayout extends Frame{
    public static void main(String[] args) {
        // create the variables to hold input
        int Income;
        testLayout t = new testLayout();
    }  public testLayout() {
        // create a frame(a box to put things in)
        setTitle("Taxation Calculator");
        setBounds(200,200,500,500);
        setLayout(new GridBagLayout());
        setVisible(true);
        setSize(400,400);
        //set layout for panel p1
        setLayout (new FlowLayout ());
        Label l1 = new Label ("Enter employee's income: ");
        TextField t1 = new TextField (12);
        // couldn't vertically align text fields, used spaces instead
        Label l2 = new Label ("Enter employee's age:        ");
        TextField t2 = new TextField (12);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        show();
        t1.setText("");
        String str1 = t1.getText();
        System.out.print(str1);
    }}