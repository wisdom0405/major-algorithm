package A3bfs;
import java.util.*;

public class Pr네트워크 {
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        int answer = 0;

    }
    class Solution {
        public int solution(int n, int[][] computers) {
            int answer = 0;
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                if(!visited[i]){
                    visited[i]=true;
                    dfs(n,computers,visited,i);
                    answer++;
                }
            }
            return answer;
        }
    }
    public static void dfs(int n, int[][] computers, boolean[] visited, int tmp){
        for (int i = 0; i < n; i++) {
            if(!visited[i] && computers[tmp][i]==1 ){
                visited[i]=true;
                dfs(n,computers,visited,i);
            }
        }
    }

    // bfs
//    class Solution2 {
//        static boolean[] visited;
//        public int solution(int n, int[][] computers) {
//            //== 전역 변수 초기화 ==//
//            visited = new boolean[n];
//
//            int ans = 0;
//            for(int i=0; i<n; ++i) {
//                if(visited[i]) continue;
//                ans++;
//                // 네트워크를 찾는 로직은 bfs, dfs 중 어떤 것을 써도 상관없음
//                bfs(i, computers);
//            }
//
//            return ans;
//        }
//
//        private static void bfs(int start, int[][] computers) {
//            Queue<Integer> q = new LinkedList<>();
//            q.add(start);
//            visited[start] = true;
//            while(!q.isEmpty()) {
//                int cur = q.poll();
//
//                // 인접 행렬 돌기
//                int[] nexts = computers[cur];
//                for(int i = 0; i < nexts.length; ++i) {
//                    if(nexts[i] == 0) continue;
//                    if(visited[i]) continue;
//                    visited[i] = true;
//                    q.add(i);
//                }
//            }
//        }
//    }

}
