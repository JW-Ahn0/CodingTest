package Class4.C_9251;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int max = 0 ;
        if(str1.equals("") || str2.equals("")){
            System.out.println(0);
        }
        else{
            int[][] dp = new int[str1.length()][str2.length()];
            boolean isExist = false;
            for(int i = 0 ; i < str1.length();i++){
                if(str1.charAt(i) == str2.charAt(0)){
                    isExist = true;
                }
                if(isExist){
                    dp[i][0] = 1;
                }
                else{
                    dp[i][0] = 0;
                }
                max = Math.max(max,dp[i][0]);
            }
            isExist = false;
            for(int i = 0 ; i < str2.length();i++){
                if(str1.charAt(0) == str2.charAt(i)){
                    isExist = true;
                }
                if(isExist){
                    dp[0][i] = 1;
                }                
                else{
                    dp[0][i] = 0;
                }
                max = Math.max(max,dp[0][i]);
            }
            
            for(int i = 1 ; i <str1.length();i++){
                for(int j = 1; j< str2.length();j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                    max = Math.max(max,dp[i][j]);
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}