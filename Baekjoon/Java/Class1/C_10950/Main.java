package C_10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int A,B ;
        for(int i = 0 ; i < t;i++){
            A=sc.nextInt();
            B=sc.nextInt();
            System.out.println(A+B);
        }
        sc.close();
        
    }
}