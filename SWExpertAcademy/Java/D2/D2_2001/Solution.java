package SWExpertAcademy.Java.D2.D2_2001;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1 ;i<=T;i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[][] arr =new int[N][N];
			for(int j = 0 ; j < N;j++) {
				for(int k = 0 ; k<N;k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			System.out.println("#"+i+" "+ getAnswer(arr,N,M) );
			
		}
		
		sc.close();
	}
	private static int getAnswer(int[][] arr, int N,int M) {
		int[][] newArr = getSumArr(arr);
		int max = 0;
		for(int i = 1; i<=N-M+1;i++) {
			for(int j =1 ; j<=N-M+1;j++) {
				int temp = getSum(newArr,i,j,M);
				//System.out.println("i : "+ i + " j :" + j +" temp : " + temp);
				max = max<temp ? temp : max;
			}
		}
		return max;
	}
	private static int getSum(int[][] arr,int y,int x, int M) {
		int sum = 0;
		for(int i = 0 ; i < M;i++) {
			sum+= arr[y+i][x+M-1]-arr[y+i][x-1];
		}
		return sum;
	}
	private static int[][] getSumArr(int[][] arr){
		int n = arr.length;
		int[][] newArr =new int[n+1][n+1];
		for(int i = 1 ; i <=n;i++) {
			for(int j = 1 ; j <=n;j++) {
				newArr[i][j] =newArr[i][j-1]+arr[i-1][j-1]; 
			}
		}
		return newArr;
	}
}