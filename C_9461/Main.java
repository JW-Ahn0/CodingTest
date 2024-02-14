package C_9461;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 2;
        arr[5] = 2;
        for(int i = 6 ;i<101;i++){
            arr[i] = arr[i-1]+arr[i-5];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i <t;i++){
            int n = sc.nextInt();
            sb.append(n+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}