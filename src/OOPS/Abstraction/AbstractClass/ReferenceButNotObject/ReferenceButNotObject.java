package OOPS.Abstraction.AbstractClass.ReferenceButNotObject;

//for an abstract class, we can create a reference,but not the object.

//Exposing the set of services but hiding the internal implementation

abstract class Plane{
    public abstract void takeOff();
    public abstract void fly();
    public abstract void land();
}

class CargoPlane extends Plane{
    public void takeOff(){
        System.out.println("Cargo plane takeOff");
    }
    public void fly(){
        System.out.println("Cargo plane fly");
    }
    public void land(){
        System.out.println("Cargo plane land");
    }
}

class PassengerPlane extends Plane{
    public void takeOff(){
        System.out.println("Passenger plane takeOff");
    }
    public void fly(){
        System.out.println("Passenger plane fly");
    }
    public void land(){
        System.out.println("Passenger plane land");
    }
}

class FighterPlane extends Plane{
    public void takeOff(){
        System.out.println("Fighter plane takeOff");
    }
    public void fly(){
        System.out.println("Fighter plane fly");
    }
    public void land(){
        System.out.println("Fighter plane land");
    }
}

class Airport{
    public void allowPlane(Plane ref){ //Reference of Abstract class is used to collect the Objects of the child classes
        ref.takeOff();
        ref.fly();
        ref.land();
        System.out.println();
    }
}

public class ReferenceButNotObject {
    public static void main(String[] args) {
        Airport a = new Airport();
        a.allowPlane(new PassengerPlane());
        a.allowPlane(new CargoPlane());
        a.allowPlane(new FighterPlane());
    }
}
