package C_2609;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = gcd(a,b);
        System.out.println(temp);
        System.out.println(a*b/temp);
        sc.close();
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}