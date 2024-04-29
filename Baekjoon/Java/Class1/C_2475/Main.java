package C_2475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0 ;
        for(int i = 0 ; i < 5;i++){
            int num = sc.nextInt();
            answer += num*num;
        }
        System.out.println(answer % 10);
        sc.close();
    }
}