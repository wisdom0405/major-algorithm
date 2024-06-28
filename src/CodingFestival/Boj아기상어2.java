package CodingFestival;

import java.util.*;
// 세호님 코드
public class Boj아기상어2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        int[] dx = {1,0,-1,0,1,1,-1,-1};
        int[] dy = {0,1,0,-1,1,-1,1,-1};
        List<int[]> shark = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] ==1) shark.add(new int[]{i,j,0}); // 만약 상어를 발견했을 경우 바로 상어의 좌표를 list에 add (좌표 + 이동칸수)
            }
        }
        Deque<int[]> dq = new ArrayDeque<>(shark); // 상어의 좌표를 바로 dq에 넣음
        while (!dq.isEmpty()){
            int[] tmp = dq.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp[0]+dx[i]; // 다음 x좌표
                int ny = tmp[1]+dy[i];  // 다음 y좌표
                if(nx<0 || nx>=N || ny<0 || ny>=M) continue; // 범위 벗어나면 continue
                if(arr[nx][ny]==1) continue; // 이미 방문했으면 continue (visited 따로 안빼고 1이면 방문한것으로 간주)
                arr[nx][ny]=1; // 해당 좌표의 값을 1로 처리 => 방문체크
                dq.add(new int[]{nx,ny,tmp[2]+1}); // (인접 좌표, 이동칸수+1) dq에 add
            }
            if(dq.isEmpty()) System.out.println(tmp[2]); // 제일 마지막으로 빠져나오는 tmp의 이동칸수 출력 => 최대 안전거리
        }
    }
}
