package PrefixSum;

public class MinimumPenaltyForAShop {

    public int bestClosingTime1(String str) {
        //the prefix and suffix array here are not usual ones they are special designed as per the question
        int n = str.length();
        int[] pre = new int[n + 1];

        for(int i=1;i<=n;i++){
            pre[i]+= pre[i-1];
            if(str.charAt(i-1)=='N') pre[i]+=1;
        }

        int[] suf = new int[n+1];
        for(int i=n-1;i>=0;i--){
            suf[i] += suf[i+1];
            if(str.charAt(i)=='Y') suf[i] += 1;
        }

        int[] penalty = new int[n+1];
        int min = n+5;
        for(int i=0;i<=n;i++){
            penalty[i] = pre[i] + suf[i];
            min = Math.min(min,penalty[i]);
        }
        for(int i=0;i<=n;i++){
            if(penalty[i]==min) return i;
        }
        return 3252; //anything random
    }
}
