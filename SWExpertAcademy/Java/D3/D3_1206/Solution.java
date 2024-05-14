package SWExpertAcademy.Java.D3.D3_1206;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int i = 1 ; i<=T;i++) {
			int n= sc.nextInt();
			int[] arr = new int[n];
			int sum = 0;
			for(int j = 0 ;j < n;j++) {
				arr[j] = sc.nextInt();
			}
			for(int j = 0 ; j < n;j++) {
				if(arr[j]==0) continue;
				int max = 0;
				max = Math.max( Math.max(arr[j-1], arr[j-2]),Math.max(arr[j+1], arr[j+2]));
				if(arr[j]-max >0)
					sum += arr[j] -max;
			}
			System.out.println("#" + i + " " + sum);
		}
		sc.close();
	}
}
