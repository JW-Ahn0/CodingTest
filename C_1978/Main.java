package C_1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0 ;
        int temp;
        for(int i = 0 ; i<n;i++){
            temp = sc.nextInt();
            if(isSosu(temp)){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
    private static boolean isSosu(int num){
        if(num==1){
            return false;
        }
        for(int i = 2 ; i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}