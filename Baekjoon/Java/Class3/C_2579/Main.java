package C_2579;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] input  =new int[t];
        int[] max =new int[t];
        for(int i = 0 ; i < t;i++){
            input[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i <t;i++){
            if(i==0){
                max[i] = input[i];
            }
            else if(i==1){
                max[i] = max[i-1]+input[i];
            }
            else if(i==2){
                max[i] = Math.max(input[i-1]+input[i],max[i-2]+input[i]);
            }
            else{
                max[i] = Math.max(max[i-2]+input[i],max[i-3]+input[i-1]+input[i]);
            }
        }
        System.out.println(max[t-1]);
        sc.close();
    }
}
