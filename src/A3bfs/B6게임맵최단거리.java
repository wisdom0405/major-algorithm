package A3bfs;
import java.util.*;

public class B6게임맵최단거리 {
    static boolean[][] visited;
//    static int[][] map;
    static int count;

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
    }
    public int solution(int[][] maps) {
//        maps = maps;
        int rows = maps.length;
        int cols = maps[0].length;

        // 갈수없는길(0)은 미리 방문처리 (visited = true)
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(maps[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        // 상대의 진영이 모두 막혀있는 경우 -1 return
        if(maps[rows - 1][cols - 2] == 0 && maps[rows - 2][cols -1] == 0) return -1;

        bfs(maps,0,0,1);
        return count;
    }

    static void bfs(int[][]maps, int x, int y, int count) {
        Queue<int[]> q = new LinkedList<>();
        if(maps[x][y] == 1) q.add(new int[]{x, y});
        while(!q.isEmpty()) {

        }

    }
}
