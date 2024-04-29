package C_1157;

import java.util.Scanner;

public class Main2 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        char[] charArr = new char[128];
        for(int i = 0 ; i < str.length();i++){
            charArr[str.charAt(i)]++;
        }
        int max = 0;
        char temp = 0;
        int count = 0 ;
        for(int i = 0 ; i < charArr.length;i++){
            if(max < charArr[i]){
                max = charArr[i];
                temp = (char)i;
            }
        }
        for(int i = 0 ; i < charArr.length;i++){
            if(charArr[i]==max){
                count++;
            }
        }
        if(count>1){
            System.out.println("?");
        }
        else{
            System.out.println((char)temp);
        }
        sc.close();
    }
}
