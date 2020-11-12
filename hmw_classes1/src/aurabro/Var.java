package aurabro;

public class Var {
   public int a;
    public int b;

    public void sum() {
        System.out.println(a+b);
    }
    public void biggest() {
        if (a>b) {
            System.out.println(a);
        }else System.out.println(b);
    }
}
