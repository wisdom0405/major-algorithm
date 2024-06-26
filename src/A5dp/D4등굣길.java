package A5dp;

import java.util.Arrays;

public class D4등굣길 {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int[][] road = new int[m][n]; // 0부터 시작 (집: 0,0) (학교: 3,2)
        int[][] puddles = {{2,2}};

        for(int i=0; i<m; i++) {
            Arrays.fill(road[i], -1); // 모든길 -1값으로 초기화
        }

        // 물웅덩이가 있는 곳 표시하기
        for(int i = 0; i < puddles.length; i++){
            int x = puddles[i][0] - 1; // 물웅덩이 x좌표 index
            int y = puddles[i][1] - 1; // 물웅덩이 y좌표 index
            road[x][y] = 0; // 물웅덩이가 있는 곳은 -1로 표시
        }
        // 오른쪽, 아래로만 움직일 수 있음
        // 집에서 오른쪽 끝까지 갈 수 있는 방법 : 1가지밖에 없음
        for(int i = 0; i < m; i++){
            road[i][0] = 1;
        }
        // 집에서 아래쪽 끝까지 갈 수 있는 방법 : 1가지밖에 없음
        for(int i = 0; i < n; i++){
            road[0][i] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(road[i][j] == 0) break; // 현재위치가 물웅덩이면 pass
                if((i-1) > 0 && (j-1) > 0){ // 왼쪽, 위가 존재한다면
                    road[i][j] = road[i-1][j] + road[i][j-1];
                }else if((i-1) > 0 && (j-1) < 0){
                    road[i][j] = road[i-1][j];
                }else if((i-1) < 0 && (j-1) > 0){
                    road[i][j] = road[i][j-1];
                }
            }
        }


        System.out.println(Arrays.deepToString(road));
        System.out.println(road[m-1][n-1]);

    }
    class Solution {
        public int solution(int m, int n, int[][] puddles) {
            int answer = 0;
            return answer;
        }
    }
}
