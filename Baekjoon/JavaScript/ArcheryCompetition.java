import java.util.*;

public class ArcheryCompetition {
    public static void main(String[] args) {
        // 주어진 힘과 점수의 매핑
        Map<Integer, Set<Integer>> powerToScores = new HashMap<>();
        powerToScores.put(1, new HashSet<>(Arrays.asList(1, 100)));
        powerToScores.put(2, new HashSet<>(Arrays.asList(3, 4, 5, 102, 103, 104)));
        powerToScores.put(4, new HashSet<>(Arrays.asList(6, 8, 105, 11, 107, 110)));
        powerToScores.put(6, new HashSet<>(Arrays.asList(114, 10, 12, 109, 111)));

        int targetScore = 319;
        int result = findMinimumPower(powerToScores, targetScore);
        System.out.println(result);
    }

    public static int findMinimumPower(Map<Integer, Set<Integer>> powerToScores, int targetScore) {
        // DP 배열 초기화
        int[] dp = new int[targetScore + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // 0 점수를 얻기 위한 힘은 0

        // 각 힘과 점수의 조합을 통해 DP 배열 업데이트
        for (Map.Entry<Integer, Set<Integer>> entry : powerToScores.entrySet()) {
            int power = entry.getKey();
            Set<Integer> scores = entry.getValue();

            // 역순으로 업데이트하여 중복 사용 방지
            for (int j = targetScore; j >= 0; j--) {
                for (int score : scores) {
                    if (j >= score && dp[j - score] != Integer.MAX_VALUE) {
                        dp[j] = Math.min(dp[j], dp[j - score] + power);
                    }
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(i + " : " + dp[i]);
        }
        

        // 목표 점수를 얻기 위한 최소 힘 반환
        return dp[targetScore] == Integer.MAX_VALUE ? -1 : dp[targetScore];
    }
}