package SWExpertAcademy.Java.D3.D3_2805;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <=T;i++) {
			int n = sc.nextInt();
			String[] arr = new String[n];
			for(int j = 0; j < n;j++) {
				arr[j] = sc.next();
			}
			int r = n/2;
			boolean isDown = true ;
			int sum =0;
			for(int j= 0 ; j < n;j++) {
				String str = arr[j];
				for(int k = r ; k <n-r;k++) {
					sum+=Integer.valueOf(str.charAt(k)-'0');
				}
				if(isDown) {
					r--;
					if(r==0)
						isDown = false;
				}
				else {
					r++;
				}
			}
			System.out.println("#"+i+" " +sum);
		}
		sc.close();
	}
}