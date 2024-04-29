package C_2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i = 1; i<n;i++){
            if(test(i)==n){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }
    public static int test(int num){
        int temp = num;
        int answer = 0;
        while(temp>0){
            answer +=temp%10;
            temp/=10;
        }
        return answer+num;
    }
}