package C_10250;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int H,W,N;
        for(int i = 0 ; i < t;i++){
            H =  sc.nextInt();
            W =  sc.nextInt();
            N =  sc.nextInt();
            int number; 
            int floor; 
            if(N%H==0){
                number = N/H;
                floor = H;
            }
            else{
                number = N/H+1;
                floor = N%H;
            }
            if(number < 10){
                System.out.println(floor +"0"+number);
            }
            else{
                System.out.println(floor +""+number);
            }
        }
        sc.close();
    }
}