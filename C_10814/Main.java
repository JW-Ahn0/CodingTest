package C_10814;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    static class Pair {
        private int age;
        private String name;
    
        public Pair(int age,String name){
            this.age = age;
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public int getAge(){
            return this.age;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Pair> list = new ArrayList<>();
        for(int i = 0 ; i < t;i++){
            int age = sc.nextInt();
            String name = sc.next();
            Pair temp = new Pair(age,name);
            list.add(temp);
        }

        list.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b){
                return a.getAge()-b.getAge();
            }
        });
        for(int i = 0 ; i <list.size();i++){
            System.out.println(list.get(i).getAge()+" "+list.get(i).getName());
        }
        sc.close();
    }

}
