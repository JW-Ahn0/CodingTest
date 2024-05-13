package SWExpertAcademy.Java.D2.D2_1966;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1 ; i<=T;i++) {
			int n = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int j = 0 ; j <n;j++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list,new Comparator<Integer>() {
				@Override
				public int compare(Integer a, Integer b) {
					return a-b;
				}
			});
			String output = "#" + i +" ";
			for(int j = 0 ; j <n;j++) {
				output += list.get(j)+" ";
			}
			System.out.println(output);
		}
		sc.close();
	}
}