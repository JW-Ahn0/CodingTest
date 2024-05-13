package SWExpertAcademy.Java.D2.D2_2005;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i<=T;i++) {
			int n = sc.nextInt();
			System.out.println("#"+i);
			printTri(n);
		}
		sc.close();
	}
	private static void printTri(int n) {
		List<List<Integer>> resultList = new ArrayList<>();
		for(int i = 0 ; i <n;i++) {
			int k = i+1;
			List<Integer> list = new ArrayList<>();
			for(int j = 0 ; j <k;j++) {
				if(list.isEmpty() || j == k-1) {
					list.add(1);
				}
				else {
					List<Integer> upList = resultList.get(k-2);
					list.add(upList.get(j-1) + upList.get(j));
				}
				
			}
			resultList.add(list);
		}
		for(int i = 0 ; i < n;i++) {
			List<Integer> tempList = resultList.get(i);
			for(int j = 0 ; j < tempList.size();j++) {
				System.out.print(tempList.get(j) +" ");
			}
			System.out.println();
		}
	}
}