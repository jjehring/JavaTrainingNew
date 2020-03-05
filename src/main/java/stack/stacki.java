package stack;

import java.util.Arrays;
import java.util.Stack;

public class stacki implements StackLike{
     int [] myArray = new int[10];
     //private int myArray[0];
     public int arrPos = 0;

    public static void main(String[] args) {
        StackLike s = new stacki();
        s.push(1);
        System.out.println(s.isEmpty());
        System.out.println(s.toString());
        s.push(1);
        System.out.println(s.isEmpty());
        System.out.println(s.toString());
        s.pop();
        System.out.println(s.isEmpty());
        System.out.println(s.toString());
        s.pop();
        System.out.println(s.toString());
        System.out.println(s.isEmpty());

    }

    @Override
    public String toString() {
        return "stacki{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }


    // add by one
    public void push (int n)
    {
        if (arrPos >= myArray.length)
            throw new RuntimeException("Stack is full");
        System.out.println("Method push");

       // int al = myArray.length;
       // myArray[al+1]=n;
        myArray[arrPos]=n;
       // myArray = null;
      //  Arrays.fill(myArray,n);
        arrPos++;
    }

    // delete one from top
    public int pop ()
    {
        System.out.println("Method pop");
        //arrPos--;
       // myArray[--arrPos];

        return myArray[--arrPos];
    }

    // check if empty
    public boolean isEmpty() {
        return (arrPos == 0);
    }

}
