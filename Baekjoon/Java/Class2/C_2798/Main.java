package C_2798;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0;
        int[] arr = new int[t];
        for(int i = 0 ; i<t;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < t-2;i++){
            for(int j = i+1;j<t-1;j++){
                for(int k = j+1; k<t;k++){
                    if(arr[i]+arr[j]+arr[k]<=m){
                        answer = Math.max(answer,arr[i]+arr[j]+arr[k]);
                    }
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}