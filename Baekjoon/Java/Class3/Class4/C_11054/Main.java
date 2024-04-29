package Class4.C_11054;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int[] dp1 = new int[t];
        int[] dp2 = new int[t];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for(int i = 0 ; i < t; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i< t;i++){
            for(int j = 0; j<i;j++){
                if(arr[i]>arr[j]){
                    dp1[i] = Math.max(dp1[i],dp1[j]+1);
                }
            }    
        }
        for(int i = t-1;i>=0;i--){
            for(int j = t-1;j>i;j--){
                if(arr[i]>arr[j]){
                    dp2[i] = Math.max(dp2[i],dp2[j]+1);
                }
            }
        }
        int answer = 0 ;
        for(int i = 0 ; i < t;i++){
            answer = Math.max(answer,dp1[i]+dp2[i]-1);
        }
        System.out.print(answer);
        
            
        sc.close();
    }
}
// 1, 1 {1}
// 5, 2 {1,5}
// 2 ,2 {1,2}
// 1 ,1 {1}
// 4 ,3 {1,2,4}
// 3 ,3 {1,2,3}
// 4 ,4 {1,2,3,4}
// 5 ,5 {1,2,3,4,5}
// 2 ,2 {1,2}
// 1 ,1 {1}


//1, 1{1}
//2, 2{1,2}
//5, 3{1,2,5}
//4, 3{1,2,4}
//3 ,3{1,2,3}
//4, 4{1,2,3,4}
//1 ,1{1}
//2 ,2{1,2}
//5 ,5{1,2,3,4,5}
//1 ,1{1}

