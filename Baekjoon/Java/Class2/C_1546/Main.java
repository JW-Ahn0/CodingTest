package C_1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        double sum = 0;
        double max = -1;
        for(int i = 0 ; i < t;i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i = 0 ; i <t;i++){
            sum+= arr[i]/max*100;
        }
        System.out.println(sum/t);
        
        sc.close();
    }
}