package TwoDImensionalArrayList.Questions;
import java.util.ArrayList;
import java.util.List;
public class pascalsTriangle {
    //Given an integer 'numRows' , generate Pascal's triangle , return it in a 2D ArrayList , as it has different col for diff rows

    //first and last element me 1 add krna hai baki jagah upar k 2 (i-1,j) and (i-1,j-1) elements ka sum add krna hai
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int numRows = 5;

        for(int i =0 ; i < numRows ; i++){
            List<Integer> l = new ArrayList<>(); //apne har row k elements is List m dalte jayenge fir is list ko apni main ans wali List m daal denge
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i){ //bcz qst and last col element of every row is 1
                    l.add(1);
                }
                else{
                    l.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
                }
            }
            ans.add(l);
        }

        System.out.print(ans+" ");
    }
}
