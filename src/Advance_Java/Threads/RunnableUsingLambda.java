package Advance_Java.Threads;


//NOTE-> Runnable is a Functional Interface.

public class RunnableUsingLambda {
    public static void main(String[] args) {

//        Using Anonymous Class
//        Runnable obj = new Runnable() { //using Anonymous Class
//
//            public void run(){
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Hi");
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {throw new RuntimeException(e);}
//                }
//            }
//        };

        //Using Lambda Expression
        Runnable obj = ()->{
            for (int i = 0; i < 5 ; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5 ; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };

//        We don't even need classes now.

        //creating threads
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
