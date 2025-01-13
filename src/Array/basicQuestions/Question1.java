package Array.basicQuestions;

public class Question1 {
    public static void main(String[] args) {
//        Given an array of marks of students , if mark of any student is less than 35
//        print its roll number. [roll number here refers to the index of array.]

        int[] arr = {81,17,95,36,31,100,60};

        for(int i =0 ; i<arr.length;i++){
            if(arr[i] < 35){
                System.out.print(i+" ");
            }
        }
    }
}
