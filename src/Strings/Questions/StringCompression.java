package Strings.Questions;
//NOTE:- Check this problem on Leetcode 443
// Done by two pointer basic approach
public class StringCompression {
    //jo letter cont jitni baar hai usse likho uski freq k sath if freq 1 then skip writing freq
    //Leetcode 443
    public static void main(String[] args) {
        String s = "ccccaaaiiiissghwwwiikkkslll";
        char[] arr = s.toCharArray();
        String ans=""; //to store ans

        int i=0,j=0; //two pointers
        while(j<arr.length){
            if(arr[i] == arr[j]) j++;
            else{
                ans+=arr[i];
                int len = j-i;
                if(len > 1) ans+=len;
                i=j;
                // the last letter will be left bcz j will come out of the loop
            }
        }
        // to handle the last letter
        ans+=arr[i];
        int len = j-i;
        if(len > 1) ans+=len;

        System.out.println(ans);
    }
}

// String waste a lot of space so you can also use StringBuilder
// just declare SB and replace s += with s.append()