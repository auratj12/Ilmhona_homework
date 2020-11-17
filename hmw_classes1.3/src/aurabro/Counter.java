package aurabro;

public class Counter {
    int currentNumber;
    public Counter(int number ) {
this.currentNumber = number;

    }
    void sum() {
        System.out.println(currentNumber+1);
    }
    public void subt() {
        if (currentNumber>1) {
            System.out.println(currentNumber-1);
        }
    }
    public void origin() {
        System.out.println(currentNumber);
    }
}
