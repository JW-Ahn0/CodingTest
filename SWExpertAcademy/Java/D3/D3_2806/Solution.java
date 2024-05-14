package SWExpertAcademy.Java.D3.D3_2806;

import java.util.*;

public class Solution {
	static int count = 0 ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1; i<=T;i++) {
			count = 0 ;
			int n = sc.nextInt();
			int[] arr = new int[n];
			dfs(arr,n,0);
			System.out.println("#" + i +" " + count);
		}
		sc.close();
	}
	private static void dfs(int[] arr, int n, int now) {
		if(now == n) {
			count++;
			return ;
		}
		for(int i = 0 ; i < n ;i++) {
			arr[now] = i;
			if(isValid(arr,now)) {
				dfs(arr,n,now+1);
			}
		}
	}
	private static boolean isValid(int[] arr, int now) {
		for(int i = 0 ; i < now;i++) {
			if(arr[i] == arr[now] ) return false;
			if(Math.abs(now-i) == Math.abs(arr[now]-arr[i])) return false;
		}
		return true;
	}
}