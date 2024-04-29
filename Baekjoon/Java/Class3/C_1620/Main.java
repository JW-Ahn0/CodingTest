package C_1620;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Map<String,Integer> map = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= n ; i++){
            String str = sc.nextLine();
            map.put(str,i);
            map2.put(i,str);
        }
        for(int i = 0 ; i <m;i++){
            String str = sc.nextLine();
            if(map.containsKey(str)){
                sb.append(map.get(str)+"\n");
            }
            else{
                sb.append(map2.get(Integer.valueOf(str))+"\n");
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
