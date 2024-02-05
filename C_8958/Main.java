package C_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t;i++){
            int count = 0;
            int score = 0 ;
            String result = sc.nextLine();
            for(int j = 0 ; j<result.length();j++){
                if(result.charAt(j)=='O'){
                    count++;
                    score+=count;
                }
                else{
                    count = 0 ;
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}