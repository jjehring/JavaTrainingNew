package object;

public class clickCounter {
    // have a private counter value initially zero

    // up methoed
    // get method
    // reset method to get back to zero

    private int clickCounterVar  ;


    public clickCounter() {
        clickCounterVar = 0;
    }

    public clickCounter upCounter() {  // void just says it a method without return
        clickCounterVar++;
        return this;
    }

    public int getClickCounter() {
        return clickCounterVar;
    }

    public clickCounter resetClickCounter() {
        clickCounterVar = 0;
        return this;
    }

}
