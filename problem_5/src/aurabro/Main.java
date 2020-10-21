package aurabro;

public class Main {

    public static void main(String[] args) {

        int arrayln[] = {12,32,43,54,6,5,-4,-6,-12};

        sum(arrayln);
    }
    public static void sum(int[] array) {
        int count = 0;
        for (int i = 0; i<array.length; i++){
            count += array[i];
            System.out.println(count);
        }
    }

}/*
Опять эта проблема я незнаю что же мне делать:12
44
87
141
147
152
148
142
130
 */