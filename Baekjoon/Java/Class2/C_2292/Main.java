package C_2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long i = 1 ;
        int count =1;
        while(i<n){
            i += count*6;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}