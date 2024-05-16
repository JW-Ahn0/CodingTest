package SWExpertAcademy.Java.D3.D3_5215;


import java.util.*;

public class Solution {
	static int max = 0 ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1 ; i<=T;i++) {
			int N = sc.nextInt();
			int L = sc.nextInt();
			max = 0 ;
			int[][] arr = new int[N][2];
			for(int j = 0 ; j < N;j++) {
				arr[j][0] = sc.nextInt();
				arr[j][1] = sc.nextInt();
			}
			dfs(0,N,L,arr,0,0);
			System.out.println("#" + i+ " " + max);
		}
		sc.close();
	}
	private static void dfs(int now, int N,int L, int[][] arr,int nowMax,int nowKal) {
		if(now-1==N) {
			max = Math.max(max, nowMax);
			return ;
		}
		for(int i = now ; i < N;i++) {
			if(nowKal+arr[i][1] <= L) {
				//System.out.println("now : " + now +" i : "+ i+ " max : " + max +" nowMax : " + nowMax + " arr[now][0] : " + arr[i][0]);
				max = Math.max(max, nowMax+arr[i][0]);
				dfs(i+1,N,L,arr,nowMax+arr[i][0],nowKal+arr[i][1]);
			}
		}
	}
}