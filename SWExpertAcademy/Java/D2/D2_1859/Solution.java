package SWExpertAcademy.Java.D2.D2_1859;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1 ; i<=T;i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] maxArr = new int[n];
			for(int j = 0 ; j <n;j++) {
				arr[j] = sc.nextInt();	
			}
			maxArr[n-1] = arr[n-1];
			for(int j = n-2 ; j>=0;j--) {
				maxArr[j] = maxArr[j+1]<arr[j] ? arr[j] : maxArr[j+1]; 
			}
			long sum = 0;
			for(int j = 0 ; j < n;j++) {
				sum +=maxArr[j]-arr[j];
			}
			System.out.println("#"+i+" "+sum);
			
		}
		sc.close();
		
	}
}
