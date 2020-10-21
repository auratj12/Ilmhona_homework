package aurabro;

public class Main {

    public static void main(String[] args) {

        sumOfSquires(3, 5);

    }
    public static void sumOfSquires(int x, int y) {
        int sum = 0;
        for (int i=x; i<=y; i++ ){
            sum = sum+(i*i);
            System.out.println("sum of squires of all numbers from x till y :"+sum);
        }
    }
}
/* Я здесь не понял! Почему мой код показывает
так:sum of squires of all numbers from x till y :9
sum of squires of all numbers from x till y :25
sum of squires of all numbers from x till y :50
 а не толькопоследнюю строку */
