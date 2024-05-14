package SWExpertAcademy.Java.D2.D2_1970;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1 ; i <=T;i++) {
			int money = sc.nextInt();
			System.out.println("#"+i);
			print(money);
		}
		sc.close();
	}
	private static void print(int money) {
		int[] arr1 = {50000,10000,5000,1000,500,100,50,10};
		int[] arr2 = new int[8];
		int temp = money;
		for(int i = 0 ; i < 8;i++) {
			arr2[i] = temp/arr1[i];
			temp = temp%arr1[i];
			System.out.print(arr2[i] +" ");
		}
		System.out.println();
	}
}