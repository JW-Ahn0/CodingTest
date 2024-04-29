package Class4.C_11053;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int[] answer = new int[t];
        for(int i = 0 ; i < t;i++){
            arr[i] = sc.nextInt();
        }
        int max = -1 ;
        for(int i = 0 ; i <t;i++){
            max = Math.max(max,dp(answer,arr,i));
        }
        System.out.println(max);
        sc.close();
    }
    public static int dp(int[] answer,int[] arr,int idx){
        if(answer[idx]==0){
            answer[idx] = 1; 
        }
        for(int i = 0 ; i < idx;i++){
            if(arr[i]< arr[idx]){
                answer[idx] = Math.max(answer[idx],answer[i]+1);
            }
        }
        return answer[idx];
    }
}