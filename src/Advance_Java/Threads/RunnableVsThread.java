package Advance_Java.Threads;


class AA implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

class BB implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

public class RunnableVsThread {

    public static void main(String[] args) {

        //Another way to make a thread is to implements a class Runnable, bcz multiple inheritance is not possible,
        //In case a class is extending another class you can not extend Thread too so use this method.

//        AA obj = new AA();
//        BB obj2 = new BB();

        //Instead of this make the objects with Runnable reference
        Runnable obj = new AA();
        Runnable obj2 = new BB();

        //this will not work, bcz in Runnable interface does not have start method
//        obj.start();
//        obj2.start();

//        In this case you have to make Threads yourself
//        Thread has a constructor which takes a Runnable object as Argument

        Thread t1 = new Thread(obj); //we will pass the Runnable referenced object
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

//        In-short -> If u make Threads with Runnable interface, it will not have Thread methods, you have to make
//        Threads yourself.
    }
}
