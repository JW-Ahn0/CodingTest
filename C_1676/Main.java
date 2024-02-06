package C_1676;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0 ;
        long sum =1;
        for(int i = t; i>0;i--){
            sum *=i;
        }
        String str = String.valueOf(sum);
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