package C_9375;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i= 0  ; i <t;i++){
            int n = sc.nextInt();
            sc.nextLine();
            Map<String,List<String>> map = new HashMap<>();
            
            for(int j = 0 ; j < n;j++){
                String input = sc.nextLine();
                String[] arr = input.split(" ");
                if(map.containsKey(arr[1])){
                    List<String> temList = map.get(arr[1]);
                    temList.add(arr[0]);
                    map.put(arr[1],temList);
                }
                else{
                    List<String> list = new ArrayList<>();
                    list.add(arr[0]);
                    map.put(arr[1],list);
                }
            }
            int m = 1;
            for(String temp : map.keySet()){
                int size = map.get(temp).size();
                m *= size+1;              
            }
            sb.append(m-1+"\n");      
        }
        System.out.println(sb.toString());
        sc.close();
    }
}