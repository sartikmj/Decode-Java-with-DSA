package Greedy.Striver;

import java.util.Arrays;

public class NMeetingsInOneRoom {

    //sort according to the ending time

    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.


    public class data implements Comparable<data>{
        int start;
        int end;

        data(int start, int end){
            this.start = start;
            this.end = end;
        }
        public int compareTo(data d){
            return this.end - d.end;
        }
    }


    //Sort on the basis of End time

    //TC=O(2N + NlogN) SC=O(3N)
    public int maxMeetings(int start[], int end[]) {
        // add your code here

        data[] arr = new data[start.length];

        for(int i=0;i<arr.length;i++){
            arr[i] = new data(start[i],end[i]);
        }

        Arrays.sort(arr);

        //Main logic
        int count = 1;
        int freetime = arr[0].end;

        for(int i=1;i<arr.length;i++){
            if(arr[i].start > freetime){
                count++;
                freetime = arr[i].end;
            }
        }

        return count;
    }
}
