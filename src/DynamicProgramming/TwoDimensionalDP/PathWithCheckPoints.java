package DynamicProgramming.TwoDimensionalDP;

public class PathWithCheckPoints {

    //for every checkpoint take it as a separate problem, count all the unique path from start to that check point.
    //then after that take the prev checkpoint as starting point find all the unique paths fron that to the next checkpoint
    //and for the last checkpoint take that as starting point and then find total paths from that point to end point
    //at the end multiply all of them you got your ans

    //there can be many types of questions based on this like Minimum Path Sum and others

    public static void main(String[] args) {

    }
}
