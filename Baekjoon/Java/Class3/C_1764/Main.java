package C_1764;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        int count = 0 ;
        StringBuilder sb =new StringBuilder();
        List<String> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String temp;
        // n (n<=500000)
        for(int i = 0 ; i <n;i++){
            temp = sc.nextLine();
            map.put(temp,1);
        }
        // m (m<=500000)
        for(int i = 0 ; i <m;i++){
            temp = sc.nextLine();
            if(map.containsKey(temp)){
                count++;
                list.add(temp);
            }
        }
        // n log n  (n<=500000)
        Collections.sort(list);
        System.out.println(count);
        // n (n<=500000)
        for(int i = 0 ; i <list.size();i++){
            sb.append(list.get(i)+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}