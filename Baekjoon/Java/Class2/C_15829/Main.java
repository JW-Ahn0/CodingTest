package C_15829;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        String str = sc.next();
        long sum = 0;
        for(int i = 0 ; i < t;i++){
            sum+=((int)str.charAt(i)-'a'+1)*sq(i);
        }
        System.out.println(sum%1234567891);
        sc.close();
    }
    public static long sq(int n){
        long base = 1;
        for(int i = 0;i<n;i++){
            base *= 31;
            base %=1234567891; 
        }
        return base;
    }
}