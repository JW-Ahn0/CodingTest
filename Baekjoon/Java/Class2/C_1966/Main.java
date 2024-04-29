package C_1966;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t;i++){
            LinkedList<Integer> list = new LinkedList<>();
            int n = sc.nextInt();
            int index = sc.nextInt();
            int temp;
            int count = 0;
            for(int j = 0 ; j <n;j++){
                temp = sc.nextInt();
                list.add(temp);
            }
            LinkedList<Integer> pList =new LinkedList<>();
            pList.addAll(list);
            Collections.sort(pList,Collections.reverseOrder());
            while(true){
                int now = pList.getFirst();
                if(list.getFirst()==now){
                    list.removeFirst();
                    pList.removeFirst();
                    count++;
                    if(index==0){
                        sb.append(count+"\n");
                        break;
                    }
                    else{
                        index--;
                    }
                }
                else{
                    int num = list.removeFirst();
                    list.addLast(num);
                    if(index==0){
                        index = list.size()-1;
                    }
                    else{
                        index--;
                    }
                }
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}