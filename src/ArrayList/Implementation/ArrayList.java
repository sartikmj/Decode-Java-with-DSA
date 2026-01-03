package ArrayList.Implementation;

public class ArrayList<T> {
    private Object[] elements; //Array to store elements
    private int size; //Number of elements in the list
    private static final int DEFAULT_CAPACITY = 10; //default capacity

    //Constructor to initialize the list with default capacity
    public ArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Constructor to initialize the list with custom capacity
    public ArrayList(int initialCapacity){
        if(initialCapacity < 0){
            throw new IllegalArgumentException("Capactiy can not be negative");
        }
        elements = new Object[initialCapacity];
    }

    // Add an element to the end of the list
    public void add(T element){

    }
}
