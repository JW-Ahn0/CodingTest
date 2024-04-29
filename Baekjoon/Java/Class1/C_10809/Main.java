package C_10809;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] alphabetArr = new int[26];
        Arrays.fill(alphabetArr,-1);
        for(int i =0 ; i < str.length();i++){
            if(alphabetArr[str.charAt(i)-'a'] == -1){
                alphabetArr[str.charAt(i)-'a'] = i;
            }
        }
        for(int i = 0 ; i <alphabetArr.length;i++){
            System.out.print(alphabetArr[i] +" ");
        }
        sc.close();
        
    }
}
