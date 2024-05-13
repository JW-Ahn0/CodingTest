package SWExpertAcademy.Java.D2.D2_1974;


import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for(int k = 1; k <=T;k++) {
			int n = 9;
			int[][] sudoku = new int[9][9];
			for(int i = 0 ; i < n;i++) {
				for(int j = 0 ; j < n;j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			int valid = isValid(sudoku) ? 1 : 0;
			System.out.println("#"+k+" " + valid);			
		}

		sc.close();
	}
	private static boolean isValid(int[][] sudoku) {
		int n = sudoku.length;
		if(!isGaroValid(sudoku,n) ) return false;
		if(!isSeroValid(sudoku,n)) return false;
		if(!isSecterValid(sudoku,n)) return false;
		return true;
	}
	private static boolean isGaroValid(int[][] sudoku,int n) {
		for(int i = 0 ; i < n;i++) {
			Set<Integer> set = new HashSet<>();
			for(int j = 0 ; j < n;j++) {
				set.add(sudoku[i][j]);
			}
			if(set.size()!=9) return false;
		}
		return true;
	}
	private static boolean isSeroValid(int[][] sudoku,int n) {
		for(int i = 0 ; i < n;i++) {
			Set<Integer> set = new HashSet<>();
			for(int j = 0 ; j < n;j++) {
				set.add(sudoku[j][i]);
			}
			if(set.size()!=9) return false;
		}
		return true;
	}
	private static boolean isSecterValid(int[][] sudoku,int n) {
		int[] y = {0,0,0,3,3,3,6,6,6};
		int[] x = {0,3,6,0,3,6,0,3,6};
		for(int i = 0 ; i< n;i++) {
			int startY = y[i];
			int startX = x[i];
			Set<Integer> set = new HashSet<>();
			
			for(int j = 0 ; j<3;j++) {
				for(int k = 0 ; k <3;k++) {
					set.add(sudoku[startY+j][startX+k]);
				}
			}
			if(set.size()!=9) return false;
		}
		return true;
	}
}