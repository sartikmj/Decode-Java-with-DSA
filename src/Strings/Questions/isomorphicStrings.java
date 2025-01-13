package Strings.Questions;

public class isomorphicStrings {
    //Given two strings determine if they are isomorphic , isomorphic means if u replace the letter with other letter you will get your word
    // one character can only map to one character , and one character can only be mapped by only one character
    //Leetcode 205


//    Approach
//    Make an array of size of 128 from 0 to 127 so we will align each character with its ASCII value as index of that array
//    and store the character corresponding to the character at the index which is equal to its ASCII value.
//    GIVEN: s and t have equal lengths
    public static boolean isIsomorphic(String s, String t) {

        //from s perspective

        char[] a = new char[128]; //there are total of 128 characters including all alphabets and special characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int)ch; //to get ASCII value of the character which is also the index for that character to map its aligning character

            if(a[idx] == '\0'){ // '\0' it represent null character
                a[idx] = dh; //in Array ch k index(ASCII) p dh daal diya
            }
            else{ //the index is not null
                if(a[idx] != dh){ //agar jo index p hai wo dh k alawa koi or character hai
                    return false;
                    // if not this case then it will keep continue mapping the characters and storing them
                }
            }
        }

        // we have completed the task from s perspective now we have to do this task from t perspective
        //as we have to check both that many-one and one-many both conditions are to be checked for false.

        //from t perspective
        //there are two ways to do it

//        //way 1 : using another array
//        char[] b = new char[128]; //using another array to check like same we did above , now for t perspective
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            char dh = s.charAt(i);
//            int idx = (int)ch;
//
//            if(b[idx] == '\0'){
//                a[idx] = dh;
//            }
//            else{
//                if(a[idx] != dh){
//                    return false;
//                }
//            }
//        }

        // way 2 : using the same array as used for s perspective

        for (int i = 0; i < 128; i++) {
            a[i] = '\0'; //making the index of array a to null for using it again
        }
        // all other code will be same as prev one just put a in place of b
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            char dh = s.charAt(i);
            int idx = (int)ch;

            if(a[idx] == '\0'){
                a[idx] = dh;
            }
            else{
                if(a[idx] != dh){
                    return false;
                }
            }
        }
        return true;
     
    }

    public static void main(String[] args) {

    }
}
