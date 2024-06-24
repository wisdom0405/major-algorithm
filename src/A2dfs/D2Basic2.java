package A2dfs;

import java.util.*;

public class D2Basic2 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        // 0,1,3,2,4,5 출력되어야 함.
        int[][] arr = {{0,1},{0,2},{1,3},{2,3},{3,5},{2,4}};

        adjList = new ArrayList<>();
        for(int i =0; i < 6; i++){ // 노드의 개수, 배열의 개수X
            adjList.add(new ArrayList<>());
        }

        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]); // 양방향
        }
        visited = new boolean[6]; // 노드개수만큼 visited 배열 생성 (방문여부 기록)

        // 0번 인덱스부터 dfs 시작
        dfs(0);
//        System.out.println(adjList);
        // [[1, 2], [0, 3], [0, 3, 4], [1, 2, 5], [2], [3]]
        // 0번 노드는 1,2번 노드와 연결되어있다.
        // 1번 노드는 0,3번 노드와 연결되어 있다.
        // 2번 노드는 0,3,4 노드와 연결되어 있다.
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
