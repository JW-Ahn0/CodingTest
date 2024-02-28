package Class4.C_12865;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for(int i = 0 ; i < n ;i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        int[][] dp = new int[n][k+1];
        int max = 0;
        for(int i = 0 ; i < n ;i++){
            for(int j = 1 ; j<=k;j++){
               if(i==0){
                   if(j>= w[i]){
                       dp[i][j] = v[i];
                   }
               }
               else{
                   dp[i][j] = dp[i-1][j];
                   if(j-w[i] >=0){
                       dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
                   }
               }
               max = Math.max(max,dp[i][j]);
            }
        }
        System.out.println(max);
        sc.close();
    }
}