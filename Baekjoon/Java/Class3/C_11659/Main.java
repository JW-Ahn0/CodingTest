package C_11659;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n+1];
        int[] sum = new int[n+1];
        for(int i = 1 ; i < n+1;i++){
            arr[i] = sc.nextInt();
            sum[i] += sum[i-1] + arr[i];
        }
        int a,b;
        StringBuilder sb= new StringBuilder();
        for(int i = 0;i<t;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            sb.append(sum[b]-sum[a-1]+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}