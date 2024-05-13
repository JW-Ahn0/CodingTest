package SWExpertAcademy.Java.D2.D2_1954;

import java.util.*;

public class Solution {
	//오른쪽 , 아래 , 왼쪽 ,위쪽
	static int[] dirY = {0,1,0,-1};
	static int[] dirX = {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1 ; i<=T;i++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			boolean[][] isVisited = new boolean[n][n];
			int num = 1;
			int a = 0;
			int b = 0;
			// 0 : 오른쪽, 1 : 아래, 2 : 왼쪽, : 3 : 위쪽
			int dir = 0; 
			while(num<=n*n) {
				if(!isVisited[a][b]) {
					isVisited[a][b]= true;
					arr[a][b] = num;
				}
				if(a+dirY[dir] <0 || n-1 <a+dirY[dir] || b+dirX[dir]<0 || n-1 <b+dirX[dir] || isVisited[a+dirY[dir]][b+dirX[dir]]) {
					dir = dir +1 > 3 ? 0 : dir+1;
				}
				a = a+dirY[dir];
				b = b+dirX[dir];
				
				num++;
			}
			
			System.out.println("#"+i);
			printArr(arr);
			
		}
		sc.close();
	}
	private static void printArr(int[][] arr) {
		int n = arr.length;
		for(int i = 0 ; i < n;i++) {
			for(int j = 0 ; j < n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
