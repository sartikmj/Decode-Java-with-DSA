package OOPS.Polymorphism.DynamicPolymorphism.MethodOverriding;

class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
    public void sleep(){
        System.out.println("Animal is sleeping...");
    }
}

class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey steals and eat...");
    }
    public void sleep(){
        System.out.println("Monkey is sleeping...");
    }
}

class Deer extends Animal{
    public void eat(){
        System.out.println("Deer gaze and eats...");
    }
    public void sleep(){
        System.out.println("Deer is sleeping...");
    }
}

class Lion extends Animal{
    public void eat(){
        System.out.println("Lion hunts and eats...");
    }
    public void sleep(){
        System.out.println("Lion is sleeping...");
    }
}

class Forest{
    public void allowAnimal(Animal animal){
        animal.eat();
        animal.sleep();
        System.out.println();
    }
}

public class TruPolymorphism2 {
    public static void main(String[] args) {
        Forest f = new Forest();

        f.allowAnimal(new Monkey());
        f.allowAnimal(new Deer());
        f.allowAnimal(new Lion());
    }
}
