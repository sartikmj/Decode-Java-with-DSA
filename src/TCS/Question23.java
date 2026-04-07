package TCS;

import java.util.Scanner;

public class Question23 {

    static class passengers{

        int off;
        int get;

        passengers(int off, int get){
            this.off = off;
            this.get = get;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        passengers[] arr = new passengers[n];

        for(int i=0;i<n;i++){
            arr[i] = new passengers(sc.nextInt(), sc.nextInt());
        }

        int maxPass = 0;
        int pass=0;
        for(int i=0;i<n;i++){
            pass+=arr[i].get - arr[i].off;
            maxPass = Math.max(maxPass,pass);
        }

        System.out.print(maxPass);
    }
}
