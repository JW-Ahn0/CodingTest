package C_11651;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Pair> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            Pair temp = new Pair(x,y);
            list.add(temp);
        }
        Collections.sort(list,new Comparator<Pair>(){
           @Override
           public int compare(Pair a,Pair b){
               if(a.getY()==b.getY()){
                   return a.getX()-b.getX();
               }
               return a.getY() - b.getY();
           }
        });
        for(int i = 0 ; i < t;i++){
            Pair p = list.get(i);
            sb.append(p.getX()+" " +p.getY()+"\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    static class Pair{
        private int x;
        private int y;
        public Pair(int x,int y){
            this.x= x;
            this.y =y;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
    }
}
