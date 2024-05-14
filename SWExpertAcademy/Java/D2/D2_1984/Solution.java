package SWExpertAcademy.Java.D2.D2_1984;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1 ;i<=T;i++) {
			List<Integer> list = new ArrayList<>();
			for(int j = 0 ; j < 10;j++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			list.remove(9);
			list.remove(0);
			int sum = 0;
			for(int j = 0 ; j < list.size();j++) {
				sum+= list.get(j);
			}
			System.out.println("#" + i+" " + Math.round(sum/(list.size()*1.0)));
			
			
		}
		sc.close();
	}
}
