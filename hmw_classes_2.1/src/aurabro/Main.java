package aurabro;

public class Main {
public static void main(String [] args) {
    Customer customer1 = new Customer("Akramjon","Sattorov",1234, 2340,9832);
    Customer customer2 = new Customer("Sohib","Avgono",1234,21432432,235215);
    Customer customer3 = new Customer("Nurulloh","Tradov",12312344,214343224,2334);
    Customer customer4 = new Customer("Farrux","Shermatov",9835,320985235,695);
    Customer customer5 = new Customer("Nadya","Temanov",9438,94573485,5476);
Customer[] customers = new Customer[5];
customers[0] = customer1;
customers[1] = customer2;
customers[2] = customer3;
customers[3] = customer4;   
customers[4] = customer5;
    if (customer1.getID()%2==0){
        System.out.println("1 чётный");
    }else System.out.println("это не чётный ID");
    if (customer2.getID()%2==0){
        System.out.println("2 чётный");
    }else System.out.println("это не чётный ID");
    if (customer3.getID()%2==0){
        System.out.println("3 чётный");
    }else System.out.println("это не чётный ID");
    if (customer4.getID()%2==0){
        System.out.println("4 чётный");
    }else System.out.println("это не чётный ID");
    if (customer5.getID()%2==0){
        System.out.println("5 чётный");
    }else System.out.println("это не чётный ID");

}



}


