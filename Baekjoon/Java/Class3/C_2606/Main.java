package C_2606;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();
        int n = sc.nextInt();
        boolean[] check = new boolean[n+1];
        check[1]= true;
        for(int i = 0 ; i < n+1 ;i++){
            List<Integer> tList = new ArrayList<>();
            list.add(tList);
        }
        n = sc.nextInt();
        int a,b;
        for(int i = 0 ; i < n;i++){
            a= sc.nextInt();
            b= sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        Set<Integer> set = new HashSet<>();
        next(list,1,check,set);
        set.remove(1);
        System.out.println(set.size());
        sc.close();
    }
    public static void next(List<List<Integer>> fullList,int n, boolean[] check, Set<Integer> set){
        List<Integer> list = fullList.get(n);
        for(int i = 0 ; i < list.size();i++){
            int temp = list.get(i);
            if(check[temp])
                continue;
            set.add(temp);
            check[temp] = true;
            next(fullList,temp,check,set);
        }
        return;
    }   
}

