package TCS.KNAcademy.Arrays.EasyMedium;

public class Question3 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int n = arr.length;
        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        System.out.println( (n*(n-1)/10)-sum );
    }
}
