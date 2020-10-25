package aurabro;

public class Main {

    public static void main(String[] args) {

        Person box = new Person();

        box.length = 40;
        box.wedth = 60;
        box.material = "Пластик";
        box.weight = 100;

        System.out.println("Высота:"+box.length);
        System.out.println("Ширина:"+box.wedth);
        System.out.println("Материал:"+box.material);
        System.out.println("Вес:"+box.weight);
    }
}
class Person {
    int length;
    int wedth;
    String material;
    int weight;
}
