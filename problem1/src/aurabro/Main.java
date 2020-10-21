package aurabro;

public class Main {

    public static void main(String[] args) {

        maxVal(3, 13);

    }
    public static void maxVal(int x, int y) {
        if (x>y) {
            System.out.println("max value is x: "+x);
        } else System.out.println("max value is y: "+y);
    }
}