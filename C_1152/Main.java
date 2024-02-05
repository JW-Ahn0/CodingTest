package C_1152;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String after = str.trim();
        if(after.equals("")){
            System.out.println(0);
        }
        else{
            int n = str.trim().split(" ").length;
            System.out.println(n); 

        }
        sc.close();
    }
}
