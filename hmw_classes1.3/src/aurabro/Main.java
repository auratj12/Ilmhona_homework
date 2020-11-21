package aurabro;
import static java.lang.StrictMath.pow;
    public class Main {
    public static void main(String[] args) {
       float X=3;
       int n = 13;
        double m=X;
        float rez=X;
        int i;

        for  (i =1; i<n; i++){
            m = (m*(-1 ))*( pow(X, 2));
            rez += m;
    }
        System.out.println(rez);
       }}






