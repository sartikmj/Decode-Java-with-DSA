package Advance_Java.Threads;


import java.time.Duration;

//Creating a thread -> make a class extends Thread class and it is a Thread now
class A extends Thread { //this is not an ordinary class it is a thread.
    //In every thread you need to have a run method.
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10); //sleep(milli seconds)-> asking the thread to wait for 10 milli seconds
            } catch (InterruptedException e) {throw new RuntimeException(e);}

        }
    }
}

class B extends Thread {
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10); //sleep(milli seconds)-> asking the thread to wait for 10 milli seconds
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

public class Threads {

    public static void main(String[] args) {

        A obj = new A(); // object reference to the threads.
        B obj2 = new B();

//        obj.show();
//        obj2.show();

//        to start a new thread yuo use start(),
        //starting two threads.

//        obj.start(); // start(), it calls the run method
//        obj2.start();

        //Now both threads are running simultaneously
        //Things are happening parallely

        System.out.println(obj.getPriority());
        System.out.println(obj2.getPriority());
        //Highest Priority is 10 lowest is 1.
        //By default, every thread has a normal priority i.e, 5.

//        Now if we want to print Hi and Hello alternately, we need to change the priority of threads for the Schedular
//        You are actually suggesting the schedular to give priority not setting it you will still get same pattern output

        obj2.setPriority(Thread.MAX_PRIORITY);

//        obj.start();
//        obj2.start();

//        To try to print hi hello parallely we will ask out threads to wait.

//        Now you will get hi hello alternatively, but you will still get some Hello twice together
//        it is because after waiting one of the two threads coming back to Schedular simultaneously, and Schedular is
//        giving priority to Hello bcz we set its priority to be max, otherwise you will some hi together too.

//        Now we will create a gap bet hi and hello to prevent them from reaching the schedular at the same time.

        obj.start();
        try {
            Thread.sleep(2); //sleep(milli seconds)-> asking the thread to wait for 2 milli seconds
        } catch (InterruptedException e) {throw new RuntimeException(e);}
        obj2.start();

//        this will be almost as we wanted
//        REMEMBER -> You can not control Schedular you can just optimize it.
    }
}
