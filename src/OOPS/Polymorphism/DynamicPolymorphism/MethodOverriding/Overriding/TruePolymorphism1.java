package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding;

class Plane{
    public void takeOff(){
        System.out.println("Plane tookOff...");
    }
    public void fly(){
        System.out.println("Plane fly...");
    }
    public void land(){
        System.out.println("Plane land...");
    }
}

class PassengerPlane extends Plane{
    public void takeOff(){
        System.out.println("PassengerPlane tookOff...");
    }
    public void fly(){
        System.out.println("PassengerPlane is flying...");
    }
    public void land(){
        System.out.println("PassengerPlane is landing...");
    }
}

class CargoPlane extends Plane{
    public void takeOff(){
        System.out.println("CargoPlane tookOff...");
    }
    public void fly(){
        System.out.println("CargoPlane is flying...");
    }
    public void land(){
        System.out.println("CargoPlane is landing...");
    }
}

class FighterPlane extends Plane{
    public void takeOff(){
        System.out.println("FighterPlane tookOff...");
    }
    public void fly(){
        System.out.println("FighterPlane is flying...");
    }
    public void land(){
        System.out.println("FighterPlane is landing...");
    }
}

class Airport{
    //TruePolymorphism --------> One method working in different ways as per the Object given to it
//    ----->IMPORTANT<-----
    public void allowPlane(Plane p){ //ParentType childObject
        p.takeOff();
        p.fly();
        p.land();
        System.out.println();
    }
}


public class TruePolymorphism1 {
    public static void main(String[] args){
        //Parent class can be the reference type of child class , mean it can contain the objects of Child Class
        //like-> Plane p = null;
        // p = new PassengerPlane();
        // p = new CargoPlane();

        // we use Polymorphism so we dont have to do this:
        // p = new PassengerPlane();
        // p.fly();
        //p.land()
        // p = new CargoPlane();
        // p.fly();
        // p.land();
//Doing this thing again and again for every class instead we have Polymorphism in which one single method works for all the objects of the classes

        PassengerPlane p = new PassengerPlane();
        CargoPlane c = new CargoPlane();
        FighterPlane f = new FighterPlane();

        Airport a = new Airport();

        a.allowPlane(p);
        a.allowPlane(c);
        a.allowPlane(f);

    }
}
