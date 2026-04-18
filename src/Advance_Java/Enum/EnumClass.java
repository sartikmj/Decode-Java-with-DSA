package Advance_Java.Enum;


enum Laptop{
    Macbook(2000),
    XPS(2200),
    Surface,
    Thinkpad(1800);

    private int price;

    //Unparameterized constructor
    Laptop(){
        price = 500;
    }

    Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}

public class EnumClass {

    public static void main(String[] args) {

        Laptop lap = Laptop.Macbook;

//        System.out.println(lap);
//        System.out.println(lap + " : " + lap.getPrice());

        for(Laptop l : Laptop.values()){
            System.out.println(l + " : " + l.getPrice());
        }
    }

}
