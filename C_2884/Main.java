package C_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        boolean isHourSmall = false;
        if(M-45<0){
            M = M-45+60;
            isHourSmall = true;
        }
        else{
            M = M-45;
        }
        if(isHourSmall){
           if(H-1 < 0)
               H = 23;
            else
                H = H-1;
        }
        System.out.println(H +" " + M);
        sc.close();
    }
}