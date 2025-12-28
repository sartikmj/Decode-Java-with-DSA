package Greedy.Striver;

import java.util.Arrays;

public class ShortestJobFirst {

    //You are given an array with the time taken by the processes to execute, You have to compute the average waiting time
    //for all the processes following the Shortest Job First Scheduling Algorithm
    //All the process arrived at time=0.

    //TC=O(n + nlongn) SC=O(1)
    public static int sjf(int[] process){
        Arrays.sort(process);
        int waitingTime = 0;
        int totalTime = 0;

        for(int i = 1; i < process.length; i++){ //first process waiting time is 0, and the last will not make anyone wait
            waitingTime += process[i-1]; //every process waits for the prev process
            totalTime += waitingTime; //sum of all waiting time
        }
        return totalTime/process.length;
    }

    public static void main(String[] args) {
        int[] process = {4,3,7,1,2};

        System.out.print(sjf(process));
    }
}
