package LinkedList;

class Car{
    int price;
    String name;

    Car(int price, String name){
        this.price = price;
        this.name = name;
    }
}

public class UserDefinedDatatype {
    public static void main(String[] args){
        Car car = new Car(1600000,"Tata Harrier");
    }
}
