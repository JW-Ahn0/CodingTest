package C_1259;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str ="";
        while(true){
            str = sc.nextLine();
            if(str.equals("0"))
                break;
            int l = 0;
            int r = str.length()-1;
            boolean isPalindrop = true;
            while(l<r){
                if(str.charAt(l) != str.charAt(r)){
                    isPalindrop = false;
                    break;
                }
                l++;
                r--;
            }
            if(isPalindrop){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}