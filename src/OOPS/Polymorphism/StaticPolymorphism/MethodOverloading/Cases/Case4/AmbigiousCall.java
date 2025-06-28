package OOPS.Polymorphism.StaticPolymorphism.MethodOverloading.Cases.Case4;

// Case 4: In Case of choosing between multiple child classes Compiler generate an Compile Time Error Ambigous Call

class Sample {
    public void methodOne(String s) {
        System.out.println("String version....");
    }

    public void methodOne(StringBuffer o) {
        System.out.println("StringBuffer version....");
    }

    public void methodOne(Object o) {
        System.out.println("Object version....");
    }
}

public class AmbigiousCall {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.methodOne(new String("sachin"));  // String
        s.methodOne(new StringBuffer("sachin")); // String Buffer
//        s.methodOne(null); //CE: Ambigous Call
    }
}
