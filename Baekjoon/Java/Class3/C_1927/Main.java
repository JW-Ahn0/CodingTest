package C_1927;

import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int temp;
        for(int i = 0 ; i < t;i++){
            temp = sc.nextInt();
            if(temp ==0){
                if(pq.size()==0){
                    sb.append("0\n");
                }
                else{
                    sb.append(pq.remove()+"\n");
                }
            }
            else{
                pq.add(temp);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}