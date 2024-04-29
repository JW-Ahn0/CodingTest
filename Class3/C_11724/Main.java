package C_11724;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] check = new boolean[n+1];
        int t = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n+1;i++){
            List<Integer> temp = new ArrayList<>();
            list.add(temp);
        }
        int a,b;
        
        for(int i = 0 ; i <t;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        int count = 0 ;
        for(int i = 1 ; i<n+1;i++){
            if(check[i]==false){
                count++;
                test(check,list,i);
            }
        }
        System.out.println(count);
        sc.close();
    }
    public static void test(boolean[] check, List<List<Integer>> list, int n){
        List<Integer> temp = list.get(n);
        for(int i = 0 ; i < temp.size();i++){
            if(check[temp.get(i)])
                continue;
            check[temp.get(i)]=true;
            test(check,list,temp.get(i));
        }
    }
}