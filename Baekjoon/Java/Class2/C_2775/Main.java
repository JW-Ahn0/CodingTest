package C_2775;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] room = new int[15][15];
        for(int i = 0 ; i < 15;i++){
            for(int j = 1 ; j <15;j++){
                if(i==0){
                    room[i][j] = j;
                }
                else if(j==1){
                    room[i][j] = room[i-1][j];
                }
                else{
                    room[i][j] = room[i][j-1]+room[i-1][j];
                }
            }
        }
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< t;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            sb.append(room[k][n]+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}