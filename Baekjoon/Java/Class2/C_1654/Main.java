package C_1654;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[t];
        int max = 0;

        for(int i = 0 ; i < t;i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }
        }
        long l = 1;
        long r = max;

        long answer = 1;
        while(l<=r){
            long m = (l+r)/2;
            int count = 0;
            for(int i = 0 ; i < t;i++){
                count+=arr[i]/m;
            }
            if( n <= count){
                answer = m;
                l = m+1;
            }
            else{
                r = m-1;
            }
            
        }
        System.out.println(answer);
        sc.close();
    }
}

