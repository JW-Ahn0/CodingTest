package SWExpertAcademy.Java.D2.D2_1959;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1 ; i <= T;i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			boolean isFirstSmall = A<B ? true : false;
			int[] arrA = new int[A];
			for(int j = 0 ; j < A;j++) {
				arrA[j] = sc.nextInt();
			}
			int[] arrB = new int[B];
			for(int j = 0 ; j < B;j++) {
				arrB[j] = sc.nextInt();
			}
			int answer = isFirstSmall ? getAnswer(arrA,arrB) : getAnswer(arrB,arrA);
			System.out.println("#" + i +" "+ answer); 
		}
		sc.close();
	}
	private static int getAnswer(int[] arr1 , int[] arr2) {
		int gap = arr2.length - arr1.length;
		int max = 0 ;
		for(int i = 0 ; i <=gap;i++) {
			int sum = 0;
			for(int j = 0 ; j < arr1.length;j++) {
				sum += arr1[j]*arr2[i+j];
			}
			max = Math.max(max, sum);
		}
		return max;
	}
}