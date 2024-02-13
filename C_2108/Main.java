package C_2108;

import java.util.Scanner;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        int temp;
        double sum = 0;
        List<Integer> list  =new ArrayList<>();
        Map<Integer,Integer> map =new HashMap<>();
        int max = 0;
        for(int i = 0 ; i < t;i++){
            temp = sc.nextInt();
            list.add(temp);
            sum+=temp;
            map.put(temp,map.getOrDefault(temp,0)+1);
            max = Math.max(max,map.get(temp));
        }
        Collections.sort(list);
        StringBuilder sb =new StringBuilder();
        
        List<Integer> sameList = new ArrayList<>();
        for(Integer key: map.keySet() ){
            if(map.get(key)==max){
                sameList.add(key);
            }
        }
        //산술평균
        sb.append(Math.round(sum/t)+"\n");

        //중앙값
        sb.append(list.get(list.size()/2)+"\n");  

        //최빈값
        if(sameList.size()==1){
            sb.append(sameList.get(0)+"\n");
        }
        else{
            Collections.sort(sameList);
            sb.append(sameList.get(1)+"\n");
        }
        //범위
        sb.append( (list.get(list.size()-1) - list.get(0))+"\n");
        System.out.println(sb.toString());
        sc.close();
    }
}