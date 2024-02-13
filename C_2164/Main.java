package C_2164;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n+1];
        arr[1] =1;

        for(int i = 2; i<=n;i++){
           if(i%2==0){
                arr[i] = getEven(arr[i/2]);
               
           }
           else{
               arr[i] = getOdd(arr[(i-1)/2 +1],i);
           }
        }
        
        System.out.println(arr[n]);
        sc.close();
    }
    public static int getEven(int n){
        return 2*n;
    }
    public static int getOdd(int n,int max){
        if(n==1){
            return max;
        }
        else return 2*(n-1);
    }
}