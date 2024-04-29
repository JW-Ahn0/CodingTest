package C_10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int max = -1000000;
        int min =1000000;
        int temp;
        for(int i = 0 ; i < t; i++){
            temp = sc.nextInt();
            if(max<temp)
                max = temp;
            if(min>temp)
                min = temp;
        }
        System.out.println(min +" " + max);
        sc.close();
    }
}
