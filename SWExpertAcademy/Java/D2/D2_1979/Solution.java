package SWExpertAcademy.Java.D2.D2_1979;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int i =1 ; i <=T;i++) {
			int n = sc.nextInt();
			int k =sc.nextInt();
			int[][] arr = new int[n][n];
			for(int j = 0 ; j < n ;j++) {
				for(int m = 0 ; m < n;m++) {
					arr[j][m] = sc.nextInt();
				}
			}
			int answer = 0;
			for(int j = 0 ; j < n;j++) {
				int count = -1;
				//가로모드
				for(int m = 0 ; m < n ;m++) {
					int now = arr[j][m];
					if(now==0) {
						if(count==k) answer++;
						count = -1; 
					}
					else if(now==1) {
						count = count==-1 ? 1 : count+1;
					}
					if(m == n-1) {
						if(count==k) answer++;
						count = -1;
					}
				}
				//세로모드
				for(int m = 0 ; m < n ;m++) {
					int now = arr[m][j];
					if(now==0) {
						if(count==k) answer++;
						count = -1; 
					}
					else if(now==1) {
						count = count==-1 ? 1 : count+1;
					}
					if(m == n-1) {
						if(count==k) answer++;
					}
				}				
			}
			System.out.println("#"+i+" " + answer);
		}
		sc.close();
	}
}
