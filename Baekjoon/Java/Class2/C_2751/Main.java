package C_2751;

import java.util.Scanner ;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int temp;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t;i++){
            temp = sc.nextInt();
            list.add(temp);
        }
        Collections.sort(list);
        for(int i = 0 ; i < list.size();i++){
            sb.append(list.get(i)+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}