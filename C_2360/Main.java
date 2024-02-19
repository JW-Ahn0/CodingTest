package C_2360;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] answer =new int[2];
        int[][] arr = new int[n][n];
        for(int i = 0 ; i <n;i++){
            for(int j = 0 ; j <n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        check(arr,0,0,n,answer);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        sc.close();
    }
    //판단한다. 시작좌표 부터 n 까지,
    
    public static void check(int[][] arr,int x,int y,int n,int[] answer){
        int color = arr[x][y];
        boolean isOk = true;
        for(int i = x ; i <x+n;i++){
            for(int j = y ; j < y+n;j++){
                if(color!=arr[i][j]){
                    isOk = false;
                    break;
                }
            }
        }
        if(isOk){
            if(color==0){
                answer[0]++;
            }
            else{
                answer[1]++;
            }
        }
        else{
            check(arr,x,y,n/2,answer);
            check(arr,x+n/2,y,n/2,answer);
            check(arr,x,y+n/2,n/2,answer);
            check(arr,x+n/2,y+n/2,n/2,answer);
        }
    }
}
