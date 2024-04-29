package C_10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int temp;
        for(int i = 0 ; i < N;i++){
            temp = sc.nextInt();
            if(temp < X){
                System.out.print(temp +" ");
            }
        }
        sc.close();
    }
    
}
