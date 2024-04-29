package C_1929;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i<=n;i++){
            if(i==1){
                continue;
            }
            if(isSosu(i)){
                System.out.println(i);
            }
        }
        sc.close();
    }
    public static boolean isSosu(int num){
        for(int i = 2; i*i <=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}