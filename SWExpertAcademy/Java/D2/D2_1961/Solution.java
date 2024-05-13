package SWExpertAcademy.Java.D2.D2_1961;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1 ; i<=T;i++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			for(int j = 0; j<n;j++) {
				for(int k = 0; k<n;k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			int[][] arr90 = roate90(arr);
			int[][] arr180 = roate90(arr90);
			int[][] arr270 = roate90(arr180);
			System.out.println("#"+i);
			
			for(int j = 0;j<n;j++) {
				for(int k = 0 ; k<n;k++) {
					System.out.print(arr90[j][k]);
				}
				System.out.print(" ");
				for(int k = 0 ; k<n;k++) {
					System.out.print(arr180[j][k]);
				}
				System.out.print(" ");
				for(int k = 0 ; k<n;k++) {
					System.out.print(arr270[j][k]);
				}
				System.out.println();
			}
		}
		sc.close();
	}
	private static int[][] roate90(int[][] arr){
		int n = arr.length;
		int[][] newArr = new int[n][n];
		for(int i = 0 ; i < n;i++) {
			for(int j = 0 ; j < n;j++) {
				newArr[j][n-1-i] = arr[i][j];
			}
		}
		return newArr;
	}
}
