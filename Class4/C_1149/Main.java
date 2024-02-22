package Class4.C_1149;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int[][] dp = new int[n][3];
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < 3;j++){
                arr[i][j] = sc.nextInt();
            }
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        for(int i = 0 ; i <3;i++){
            dp[0][i] = arr[0][i];
        }
        for(int i = 1;i<n;i++){
            for(int j = 0 ; j < 3;j++){
                for(int k = 0 ; k < 3; k++){
                    if(j!=k){
                        dp[i][j] = Math.min(dp[i][j],dp[i-1][k]+arr[i][j]);
                    }
                }
            }
        }
        int max = Integer.MAX_VALUE;
        for(int i = 0 ; i < 3;i++){
            max = Math.min(max,dp[n-1][i]);
        }
        System.out.println(max);
        sc.close();
    }
}