package C_1676;

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0 ;
        BigInteger sum = new BigInteger("1");
        for(int i = t; i>0;i--){
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        String str = sum.toString();
        for(int i = str.length()-1 ; i >=0;i--){
            if(str.charAt(i)!='0'){
                System.out.println(count);
                break;
            }
            count++;
        }
        sc.close();
    }
}