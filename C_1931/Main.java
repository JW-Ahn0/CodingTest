package C_1931;

import java.util.*;

public class Main {
	public static void main(String args[]) throws Exception
	{
		Scanner sc =new Scanner(System.in);
		int tc = sc.nextInt();
		int[][] arr = new int[tc][2];
		for(int i = 0 ; i < tc;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1]= sc.nextInt();			
		}
		Arrays.sort(arr, (o1, o2) -> {
			if(o1[1] ==o2[1]) {
				return (o1[0] <= o2[0] ? -1 : 1);
			} else{
				return (o1[1] < o2[1] ? -1 : 1); 
			}
		});
		int startTime = 0;
		int endTime = 0;
		int answer = 0;
		int i = 0; 
		for(int[] time : arr) {
			if(startTime <= time[0]) {
				answer++;
				startTime = time[1];
			}
			i++;
		}
		System.out.println(answer);
        sc.close();
	}
}
