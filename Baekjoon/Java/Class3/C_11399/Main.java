package C_11399;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        // O(n)
        for(int i = 0 ; i < t;i++){
            list.add(sc.nextInt());
        }
        // O(nlogn)
        Collections.sort(list);
        int sum = 0 ;
        int answer = 0;
        // O(n)
        for(int i = 0 ; i < t;i++){
            sum+=list.get(i);
            answer+= sum;
        }
        System.out.println(answer);
        sc.close();
    }
}