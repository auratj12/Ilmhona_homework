package aurabro;


public class Main {

    public static void main(String[] args) {

        int arrayln[] = {12,32,43,54,6,5};
        maxInArray(arrayln);


    }
    public static void maxInArray(int[] array)  {
        int max=array[0];
        for (int i=0; i<array.length; i++) {
            if (max<array[i]) max=array[i];
        }
        System.out.println(max);
    }
}
