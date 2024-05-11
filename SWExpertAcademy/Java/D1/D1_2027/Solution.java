package SWExpertAcademy.Java.D1.D1_2027;

public class Solution {
	public static void main(String[] args) {
		int l = 5;
		for(int i=1; i<=l;i++) {
			for(int  j = 1; j<=l;j++) {
				if(j==i)
					System.out.print("#");
				else
					System.out.print("+");
			}
			System.out.println();
		}
	}
}
