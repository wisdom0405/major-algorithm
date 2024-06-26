package A3bfs;
// 확정된 코드
class Pr네트워크2 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(n,computers,visited,i);
                answer++;
            }
        }
        return answer;
    }
    public static void dfs(int n, int[][] computers, boolean[] visited, int start) {
        for (int i = 0; i < n; i++) {
            if(!visited[i] && computers[start][i] == 1) {
                visited[i] = true;
                dfs(n,computers,visited,i);
            }
        }
    }
}