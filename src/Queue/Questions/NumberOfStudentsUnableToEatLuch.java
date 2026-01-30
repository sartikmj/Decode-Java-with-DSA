package Queue.Questions;

//leetcode 1700
public class NumberOfStudentsUnableToEatLuch {
//    Algorithm
//    1. We need to calculate the number of students who need sandwich of type 0 and type 1 seperately
//    2. For each sandwich s[i], if there is a student in a queue who needs sandwich of the same type ,
//    if yes, we allocate the sandwich and decrease the count of student who want sandwich of same type.
//    3.If there is no one queue who want that sandwich, then all the remaining students will be hungry.
//    i.e. if any one type of students get zero then all the students in the queue will hungry.

//    TC=O(N) SC=O(1)

    public int countStudents(int[] students, int[] sandwiches) {

        int ones = 0; //count of students who prefer type1
        int zeroes = 0;  //count of students who prefer type0

        for (int i : students) {
            if (i == 0)
                zeroes++;
            else
                ones++;
        }

        // for each sandwich in sandwiches
        for (int sandwich : sandwiches) {

            if (sandwich == 0) { // if sandwich is of type0
                if (zeroes == 0) { // if no student want a type0 sandwich
                    return ones;
                } else
                    zeroes--;
            } else if (sandwich == 1) { // if sandwich is of type1
                if (ones == 0) { // if no student want a type1 sandwich
                    return zeroes;
                } else {
                    ones--;
                }
            }
        }
        return 0;
    }
}
