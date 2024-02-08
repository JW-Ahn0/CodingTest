package C_11650;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static class Pair{
        private int x;
        private int y;
        
        public Pair(int x,int y){
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x,y;
        List<Pair> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            Pair p = new Pair(x,y);
            list.add(p);
        }
        Collections.sort(list,new Comparator<Pair>(){
           @Override
           public int compare(Pair a,Pair b){
               if(a.getX()==b.getX()){
                   return a.getY()-b.getY();
               }
               else
                   return a.getX()-b.getX();
           }
        });
        for(int i =0 ; i < t;i++){
            Pair temp = list.get(i);
            sb.append(temp.getX()+" "+temp.getY()+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}