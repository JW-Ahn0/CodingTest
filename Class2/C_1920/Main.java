package C_1920;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        int temp ;
        for(int i = 0 ; i < N;i++){
            temp = sc.nextInt();
            map.put(temp,1);
        }
        int M = sc.nextInt();
        for(int i = 0 ; i < M;i++){
            temp = sc.nextInt();
            if(map.containsKey(temp)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}