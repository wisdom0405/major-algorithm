package A2dfs;

import java.util.ArrayList;
import java.util.List;

// dfs : 깊이우선탐색
public class D1Basic1 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        // 방문할 수 있는 정점이 여러개인 경우 정점번호가 작은 것을 먼저 방문하는
        // dfs 알고리즘 형식의 방문순서를 출력하라.
        // 0,1,3,2,4 출력되어야 함.
        int[][] arr = {{0,1},{0,2},{1,3},{2,3},{2,4}};

        // 0번에서 갈 수 있는 곳? => 리스트로 구현
        // 0번째 노드가 갈 수 있는 곳은 리스트의 0번째 인덱스에 리스트로 담음
        adjList = new ArrayList<>();
        for(int i =0; i < 5; i++){ // 노드의 개수, 배열의 개수X
            adjList.add(new ArrayList<>());
        }

        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
//            양방향일 경우
//            adjList.get(a[1]).add(a[0]);
        }
        visited = new boolean[5]; // 노드개수만큼 visited 배열 생성 (방문여부 기록)

        // 0번 인덱스부터 dfs 시작
        dfs(0);
    }
    static void dfs(int start){
        System.out.println(start);
        visited[start] = true; // start 번째는 방문 완료
        for(int target : adjList.get(start)){
            if(visited[target] == false){ // 아직 방문하지 않은 경우에만 가겠다.
                dfs(target);
            }
        }
    }

}
