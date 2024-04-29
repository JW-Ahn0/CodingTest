package Class4.C_11660;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] arr = new int[n][n];
        int temp;
        int x1,y1,x2,y2;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                temp = sc.nextInt();
                if(j>0){
                    arr[i][j] = arr[i][j-1]+temp;
                }
                else{
                    arr[i][j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int sum = 0 ;
        for(int k = 0 ; k <t;k++){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            sum = 0 ;
            for(int i = x1-1 ; i<=x2-1;i++){
                if(y1-2 <0){
                    sum+= arr[i][y2-1];
                }
                else{
                    sum+= arr[i][y2-1] - arr[i][y1-2];
                }
                
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}