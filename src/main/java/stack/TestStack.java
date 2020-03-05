package stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestStack {

    public static void main(String[] args) {
        List<Integer> myList = new LinkedList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        System.out.println(myList);
        System.out.println(myList.size());
        myList.set(3,355553);//   set(3,1);
        System.out.println(myList);
        System.out.println(myList.size());
        //System.out.println(myList);
        System.out.println(myList.set(myList.size()-1,444));
        System.out.println(myList);
        System.out.println(myList.size()-1);
        System.out.println(myList.remove(2));
        System.out.println(myList);
    }
}
