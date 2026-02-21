package Array.StriverSheet;

public class MoveZeroes {

    //Optimal Method
    public void moveZeroes(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
    }

    //Better Method
    public void moveZeroes1(int[] arr) {
        int n = arr.length;
        int i=0,j=1;
        while(j<n){
            if(arr[i]==0 && arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j++;
            }
            else if(arr[i]==0 && arr[j]==0) j++;
            else{ //i==1 j==0
                i++;j++;
            }
        }
    }
}
