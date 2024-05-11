package SWExpertAcademy.Java.D1.D1_2063;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < n ;i++) {
			int input = sc.nextInt();
			list.add(input);
		}
		Collections.sort(list);
		System.out.println(list.get(n/2));
		sc.close();
	}
	
}
