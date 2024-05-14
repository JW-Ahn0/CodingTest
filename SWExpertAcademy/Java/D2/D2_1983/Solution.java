package SWExpertAcademy.Java.D2.D2_1983;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		String[] strArr  = {"-","A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1 ; i<=T;i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			double scoreK = 0;
			List<Double> list = new ArrayList<>();
			int[][] arr = new int[n][3]; 
			for(int j = 0; j < n ;j++) {
				arr[j][0] = sc.nextInt();
				arr[j][1] = sc.nextInt();
				arr[j][2] = sc.nextInt();
				double score = arr[j][0]*0.35 + arr[j][1]*0.45+arr[j][2]*0.2;
				if(j+1==k) {
					scoreK = score;
				}
				list.add(score);
			}
			Collections.sort(list,Collections.reverseOrder());
			for(int j = 0 ; j < n ;j++) {
				if(list.get(j)==scoreK) {
					int index = j+1;
					if(index%(n/10) ==0) {
						index = index/(n/10);
					}
					else {
						index = index/(n/10)+1;
					}
					System.out.println("#"+ i+" "+strArr[index]);
					break;
				}
			}
		}
		sc.close();
	}
}