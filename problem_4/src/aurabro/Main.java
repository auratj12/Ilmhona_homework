package aurabro;

public class Main {

    public static void main(String[] args) {

        int arrayln[] = {12,32,43,54,6,5,-4,-6,-12};
        maxInArray(arrayln);
    }
    public static void maxInArray(int[] array)  {
        int counter = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i]<0) counter++;

        }
        int j=0;
        int[] arrayPos = new int[array.length-counter];
        for (int i=0; i<array.length; i++){
            if (array[i] > 0) {
                arrayPos[j] = array[i];
                j++;
            }
        }

        for (int i = 0; i<arrayPos.length; i++){
            System.out.println(arrayPos[i]);
        }
    }

}
