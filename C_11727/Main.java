package C_11727;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1001];
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 5;
        
        int n  =sc.nextInt();
        
        for(int i = 4 ; i <1001;i++){
            arr[i] = (arr[i-1]+arr[i-2]*2)%10007;
        }
        System.out.println(arr[n]);
        
        sc.close();
    }
}