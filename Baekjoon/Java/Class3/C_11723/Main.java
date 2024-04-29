package C_11723;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String temp;
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t; i++){
            temp = sc.nextLine();
            String[] str = temp.split(" ");
            temp = str[0];
            if(temp.equals("add")){
                int a = Integer.valueOf(str[1]);
                if(1<=a && a<=20)
                    set.add(a);
            }
            else if(temp.equals("remove")){
                int a = Integer.valueOf(str[1]);
                if(set.contains(a)){
                    set.remove(a);
                }
            }
            else if(temp.equals("check")){
                int a = Integer.valueOf(str[1]);
                if(set.contains(a)){
                    sb.append("1\n");
                }
                else{
                    sb.append("0\n");
                }
            }
            else if(temp.equals("toggle")){
                int a = Integer.valueOf(str[1]);
                if(1<=a && a<=20){
                    if(set.contains(a)){
                        set.remove(a);
                    }
                    else{
                        set.add(a);
                    }   
                }
             
            }
            else if(temp.equals("all")){
                for(int j = 1 ; j < 21;j++){
                    set.add(j);
                }
            }
            else if(temp.equals("empty")){
                set = new HashSet<>();
            }            
        }
        System.out.println(sb.toString());
        sc.close();
    }
}