package C_18870;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int temp;
        // O(n)
        for(int i = 0 ; i <t; i++){
            temp = sc.nextInt();
            list.add(temp);
            set.add(temp);
        }
        List<Integer> tempList = new ArrayList<>();
        // O(n)
        for(Integer num : set){
            tempList.add(num);
        }
        // O(n logn)
        Collections.sort(tempList);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i< tempList.size();i++){
            map.put(tempList.get(i),i);
        }
        StringBuilder sb = new StringBuilder();
        // O(n)
        for(int i = 0 ; i< list.size();i++){
            sb.append(map.get(list.get(i))+" ");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}