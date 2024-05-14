package SWExpertAcademy.Java.D2.D2_1204;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for(int i =1 ; i<=T;i++) {
			sc.nextInt();
			Map<Integer,Integer> map = new HashMap<>();
			for(int j = 0; j <1000;j++) {
				int score =sc.nextInt();
				map.put(score,map.getOrDefault(score, 0)+1);
			}
			int maxScore = 0;
			int maxCount =0;
			for(Integer key : map.keySet()) {
				if(maxCount < map.get(key)) {
					maxScore = key;
					maxCount = map.get(key);
				}
				else if(maxCount == map.get(key)) {
					maxScore = maxScore < key ? key : maxScore;
				}
			}
			System.out.println("#"+i+" " + maxScore);
		}
		sc.close();
	}
}
