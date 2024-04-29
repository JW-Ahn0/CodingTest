package C_1676;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count2 = 0;
        int count5 = 0;
        long sum = 1;
        for(int i = t; i>0;i--){
            sum = i;
            while(sum%2==0 || sum%5==0){
                if(sum%2==0){
                    count2++;
                    sum/=2;
                }
                if(sum%5==0){
                    count5++;
                    sum/=5;
                }
            }
        }
        System.out.println(Math.min(count2,count5));
        sc.close();
    }
}