package Class4.C_1629;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(test((long)a,(long)b,(long)c));
        sc.close();
    }
    public static long test(long a,long b, long c){
        if(b==1) return a%c;
        long temp = test(a,b/2,c);
        
        if(b%2==0){
            return (temp%c*temp%c)%c;
        }
        else{
            return (temp%c*temp%c*a%c)%c;
        }
    }
}
