package C_1003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] arr = new int[41][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        
        arr[1][0] = 0;
        arr[1][1] = 1;
        StringBuilder sb =new StringBuilder();
        for(int i=2;i<=40;i++){
            arr[i][0] = arr[i-1][0] + arr[i-2][0];
            arr[i][1] = arr[i-1][1] + arr[i-2][1];
        }
        for(int i = 0 ; i < t;i++){
            int temp = sc.nextInt();
            sb.append(arr[temp][0]+" " + arr[temp][1]+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}