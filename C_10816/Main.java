package C_10816;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int t = sc.nextInt();
        int temp;
        for(int i = 0 ; i < t;i++){
            temp = sc.nextInt();
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int m = sc.nextInt();
        StringBuilder sb =new StringBuilder();
        for(int i = 0 ; i < m;i++){
            temp = sc.nextInt();
            sb.append(map.getOrDefault(temp,0)+" ");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
