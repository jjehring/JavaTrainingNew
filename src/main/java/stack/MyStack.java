package stack;

public class MyStack implements StackLike {

    private int[] stack= new int[10];
    private int count = 0;

    public static void main(String[] args) {

        MyStack istack = new MyStack();

        istack.push(10);
        istack.push(7);

        istack.push(42);

        for(int i : istack.stack) {
            System.out.print(i+",");

        }

        System.out.println();

        istack.pop();
        System.out.println(istack.isEmpty());
        istack.pop();
        System.out.println(istack.isEmpty());

        istack.pop();
        System.out.println(istack.isEmpty());


        istack.pop();

    }


    public void push(int n) {
        stack[count]= n;
        count++;
    }


    public int pop() {
        count--;
        System.out.println(stack[count]);
        return stack[count];
    }


    public boolean isEmpty() {
        if ((count -1 )<0) {
            return true;
        } else {
            return false;
        }
    }
}