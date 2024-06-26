package A5dp;

import java.util.Arrays;

public class D4등굣길 {
    public static void main(String[] args) {
        int m = 4; // 열
        int n = 3; // 행

        int[][] road = new int[n][m]; // 0부터 시작 (집: 0,0) (학교: 3,2)
        int[][] puddles = {{2, 2}};
        int mod = 1000000007;

        // 물웅덩이가 있는 곳 -1로 표시하기
        for (int[] puddle : puddles) {
            road[puddle[1] - 1][puddle[0] - 1] = -1;
        }

        // 시작점 초기화
        road[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 웅덩이일 경우 0으로 바꿔주고 건너뜀
                if (road[i][j] == -1) {
                    road[i][j] = 0;
                    continue;
                }

                // 위에서 오는 경로 추가
                if (i > 0) {
                    road[i][j] += road[i - 1][j] % mod;
                }

                // 왼쪽에서 오는 경로 추가
                if (j > 0) {
                    road[i][j] += road[i][j - 1] % mod;
                }

                road[i][j] %= mod;
            }
        }

        System.out.println(Arrays.deepToString(road));
        System.out.println(road[n - 1][m - 1] % mod);
    }
}

    class Solution {
        public int solution(int m, int n, int[][] puddles) {
            int[][] road = new int[n][m]; // 0부터 시작 (집: 0,0) (학교: 3,2)
            int mod = 1000000007;
            // 물웅덩이가 있는 곳 -1로 표시하기
            for (int[] puddle : puddles) {
                road[puddle[1] - 1][puddle[0] - 1] = -1;
            }

            // 시작점 초기화
            road[0][0] = 1;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    // 웅덩이일 경우 0으로 바꿔주고 건너뜀
                    if (road[i][j] == -1) {
                        road[i][j] = 0;
                        continue;
                    }

                    // 위에서 오는 경로 추가
                    if (i > 0) {
                        road[i][j] += road[i - 1][j] % mod;
                    }

                    // 왼쪽에서 오는 경로 추가
                    if (j > 0) {
                        road[i][j] += road[i][j - 1] % mod;
                    }

                    road[i][j] %= mod;
                }
            }
            return road[n - 1][m - 1] % mod;
        }
    }

