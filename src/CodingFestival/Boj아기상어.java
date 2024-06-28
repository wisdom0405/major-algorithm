package CodingFestival;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 // 풀다 말았심
public class Boj아기상어 {
    static int[][] A;
    static boolean [][] visited;
    // 이동가능한 인접 8방향 좌표
    static int[] dx = {-1,0,1,-1,0,1,-1,0,1};
    static int[] dy = {1,1,1,0,0,0,-1,-1,-1};
    static ArrayList<int[]> shark = new ArrayList<>(); // 상어좌표
    static int max = Integer.MIN_VALUE;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        visited = new boolean[N][M];

        // 2차원 배열 입력받음
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();

            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
                if(A[i][j] == 1){
                  shark.add(new int[]{i,j,0});
                }
            }
        }

    }
    private static void bfs(int x, int y, int move) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y,move});
        while (!q.isEmpty()) {
            int[] cur = q.poll(); // cur : 현재 좌표
            for (int i = 0; i < 8; i++) {
                int nx = cur[0] + dx[i]; // 이동가능한 x좌표
                int ny = cur[1] + dy[i]; // 이동가능한 y좌표

                if(nx >= 0 && nx < N && ny >= 0 && ny < M){
                    if(!visited[nx][ny] && A[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny, move+1});
                    }else if(!visited[nx][ny] && A[nx][ny] == 1){
                        visited[nx][ny] = true;
                        break;
                    }
                }
            }
        }

    }
}
