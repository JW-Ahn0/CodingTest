package SWExpertAcademy.Java.D3.D3_1208;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int T = 10;
        int w =100;
        //10
        for(int i = 1; i <=T;i++) {
        	List<Integer> list  =new ArrayList<>();
        	int dump = sc.nextInt();
        	//100
        	for(int j = 0 ; j < w;j++) {
        		list.add(sc.nextInt());
        	}
        	//1000
        	for(int j = 0; j <dump;j++) {
        		//n log n , n 100 
        		Collections.sort(list);
        		int min  = list.get(0);
        		int max = list.get(w-1);
        		list.remove(w-1);
        		list.remove(0);
        		min++;
        		max--;
        		list.add(min);
        		list.add(max);
        	}
        	Collections.sort(list);
        	System.out.println("#"+i+" "+ (list.get(w-1) - list.get(0) ));
        }
        
        
		sc.close();
	}
}