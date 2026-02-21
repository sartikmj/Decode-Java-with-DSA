package OOPS.Abstraction.AbstractClass.ConcreteMethodInAbstractClass;

//abstract class can contain concrete and abstract methods
//concrete methods : A method with implementation
//abstract methods : A method without implementation

abstract class Bird{
    public abstract void fly();
    public abstract void eat();
}

class Sparrow extends Bird{
    public void fly(){
        System.out.println("Sparrow fly @ short height");
    }
    public void eat(){
        System.out.println("Sparrow eat grains....");
    }
}

abstract class Eagle extends Bird{
    public void fly(){
        System.out.println("Eagle fly @ very high height");
    }
    public abstract void eat();
}
class SerpentEagle extends Eagle{
    public void eat(){
        System.out.println("Serpent eagle eats snakes");
    }
}
class GoldenEagle extends Eagle{
    public void eat(){
        System.out.println("Golden eagle catches Prey over the ocean...");
    }
}

class Crow extends Bird{
    public void fly(){
        System.out.println("Crow fly @ mid height");
    }
    public void eat(){
        System.out.println("Crow eat grains....");
    }
}

class Sky{
    public void allow(Bird ref){
        ref.fly();
        ref.eat();
        System.out.println();
    }
}

public class ConcreteAndAbstractMethodsInAbstractClass {
    public static void main(String[] args) {
        Sky sky = new Sky();
        sky.allow(new Sparrow());
        sky.allow(new SerpentEagle());
        sky.allow(new GoldenEagle());
        sky.allow(new Crow());

    }
}


//Note:
//        1. abstract class contains concrete methods and abstract methods, so we say
//through abstract class 100% abstraction can't be
//achieved.
//2. To achieve 100% abstraction, we need to go for "interfaces".