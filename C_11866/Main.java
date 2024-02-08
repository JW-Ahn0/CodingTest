package C_11866;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //k=3
        int k = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        boolean[] check = new boolean[n+1];
        int count = 0;
        int start = 1;
        int index =1;
        //1    2    3    4    5    6    7
        //f    f    f    f    f    f    f
        //start = 1
        //count= 1;
        //index = 3
        while(count<n){
            if(check[index]==false ){
                if(start < k){
                    start++;
                    index++;
                    if(index>n){
                        index=1;
                    }
                }
                else if(start ==k){
                    check[index]=true;
                    start = 1;
                    count++;
                    list.add(index);
                }
            }
            else{
                index++;
                if(index>n){
                    index=1;
                }                
            }
        }
        StringBuilder sb = new StringBuilder("<");
        for(int i = 0 ; i < list.size();i++){
            if(i==list.size()-1){
                sb.append(list.get(i)+">" );
            }
            else{
                sb.append(list.get(i)+", " );
            }
            
        }
        //test2
        System.out.println(sb.toString());
        sc.close();
    }
}