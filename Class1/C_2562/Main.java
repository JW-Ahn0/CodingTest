package C_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int index =-1;
        for(int i = 1 ; i<10;i++){
            int n = sc.nextInt();
            if(max < n){
                max = n;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
        sc.close();
    }
}
