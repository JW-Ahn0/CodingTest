package C_11050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long answer = 1;
        for(int i = 0 ; i < k ; i++){
            answer *= n;
            n--;
        }
        for(int i = 2 ; i <=k;i++){
            answer /=i;
        }
        System.out.println(answer);
        sc.close();
    }
}