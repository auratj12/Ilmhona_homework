package aurabro;

public class Customer {
   private String name;
    private String surname;
    private int adress;
    private int card;
    private int ID;
    public Customer(String name,String surname,int adress,int card,int ID) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.card = card;
        this.ID = ID;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAdress() {
        return this.adress;
    }
    public int getCard() {
        return this.card;
    }
    public int getID() {
        return this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAdress(int adress) {
        this.adress = adress;
    }
    public void setCard(int card) {
        this.card = card;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

}
