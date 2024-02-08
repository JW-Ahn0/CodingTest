package C_7568;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w,h;
        List<Pair> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < n;i++){
            w = sc.nextInt();
            h = sc.nextInt();
            Pair temp = new Pair(w,h);
            list.add(temp);
        }
        for(int i = 0 ; i < n;i++){
            Pair base = list.get(i);
            int count = 0 ;
            for(int j = 0 ; j < n ;j++){
                if(i!=j&& base.getW() < list.get(j).getW() && base.getH() < list.get(j).getH()){
                    count++;
                }
            }
            sb.append(count+1+" ");
        }
        System.out.println(sb.toString());
        sc.close();
    }
    static class Pair{
        private int w;
        private int h;
        public Pair(int w,int h){
            this.w = w;
            this.h = h;  
        }
        public int getW(){
            return this.w;
        }
        public int getH(){
            return this.h;
        } 
    } 
}
