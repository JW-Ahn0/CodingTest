package C_2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = Integer.MAX_VALUE;
        
        int count = n/5;
        int temp;
        for(int i = 0; i <=count;i++){
            temp = n-5*i;
            if(temp%3==0){
                answer = Math.min(answer,temp/3+i);
            }
        }
        if(answer ==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(answer);
        }
        sc.close();
    }
}