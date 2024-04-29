package C_1463;

import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[1] = 0;
        for(int i =2;i<=n;i++){
            if(i%3==0){
                arr[i] = Math.min(arr[i/3]+1,arr[i]);
            }
            if(i%2==0){
                arr[i] = Math.min(arr[i/2]+1,arr[i]);
            }
            arr[i] = Math.min(arr[i-1]+1,arr[i]);
        }
        System.out.println(arr[n]);
        sc.close();
    }
}