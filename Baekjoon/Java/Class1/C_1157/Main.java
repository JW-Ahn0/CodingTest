package C_1157;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0 ; i < str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
            if(max < map.get(str.charAt(i))){
                max = map.get(str.charAt(i));
            }
        }
        int count = 0;
        Character temp = null;
        for(Character c : map.keySet()){
            if(map.get(c)==max){
                count++;
                temp = c;
            }
        }
        if(count > 1){
            System.out.println("?");
        }
        else{
            System.out.println(temp);
        }
        sc.close();
    }
}
