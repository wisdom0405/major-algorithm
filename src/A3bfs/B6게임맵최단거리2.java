package A3bfs;
import java.util.*;
public class B6게임맵최단거리2 {
    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int answer = -1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0,1}); // {x좌표, y좌표, distance}
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true; // visited 없이 방문했으면 maps[0][0] = -1로 세팅해도 가능

        // 상하좌우 좌표
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        // 좌표를 큐에 담는다 : 장애물 제외
        // (nxm)을 벗어나지 않는 범위 내에서 현재 좌표의 상하좌우 더한다
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재좌표
            visited[current[0]][current[1]] = true; // 현재 x,y좌표
            // 상하좌우 좌표 검사 (n x m 내에 있는지)
            for(int i = 0; i < 4; i++){
                int nx = current[0] + dx[i]; // x좌표
                int ny = current[1] + dy[i]; // y좌표

                if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length && !visited[nx][ny]){
                    if(maps[nx][ny] == 1){ // 현재 좌표가 막혀있지 않다면(1)
                        queue.add(new int[]{nx, ny, current[2] + 1}); // 큐에 새로운 좌표,distance+1값 넣음
                        visited[nx][ny] = true;
                        if(nx == maps[0].length -1 && ny == maps[0].length - 1 ){
                            // 상대 진영에 도착하면
                            answer = current[2] + 1;
                            break;
                        }
                    }
                }
            }
        }
    }
    class Solution {

        public int solution(int[][] maps) {
            int answer = 0;
            return answer;
        }
    }

}
