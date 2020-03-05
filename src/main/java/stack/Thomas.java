package stack;

import javax.crypto.spec.PSource;
import java.util.Calendar;

public class Thomas implements StackLike {
    private int[] stack = new int[100];
    private int count;

    public static void main(String[] args) {
        Thomas th = new Thomas();

        th.push(2);
        System.out.println(th.isEmpty());
        System.out.println(th.toString());
        th.push(2);
        System.out.println(th.isEmpty());
        System.out.println(th.toString());
        th.push(2);
        System.out.println(th.isEmpty());
        System.out.println(th.toString());
        th.pop();
        System.out.println(th.isEmpty());
        System.out.println(th.toString());
        th.pop();
        System.out.println(th.isEmpty());
        System.out.println(th.toString());
        th.pop();
        System.out.println(th.isEmpty());
        System.out.println(th.toString());
    }

    public Thomas() {
        count = 0;
    }

    @Override
    public void push(int n) {
        if (count >= stack.length)
            throw new RuntimeException("Stack is full");

        stack[count] = n;
        count++;
    }

    @Override
    public int pop() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return stack[--count];
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public String toString() {
        String out = "";
        if (isEmpty()) return "";
        out = ""+stack[0];
        for (int i=1; i < count; i++) {
            out = out + ", " + stack[i] ;
        }
        return out;
    }
}
