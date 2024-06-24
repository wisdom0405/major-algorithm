package A3bfs;

import java.util.*;

public class B1basic1 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        // bfs : 넓이우선탐색
        // 0 1 2 3 4 출력되어야 함
        int[][] arr = {{0,1},{0,2},{1,3},{2,3},{2,4}};

        // 0번에서 갈 수 있는 곳? => 리스트로 구현
        // 0번째 노드가 갈 수 있는 곳은 리스트의 0번째 인덱스에 리스트로 담음
        adjList = new ArrayList<>();
        visited = new boolean[5]; // 노드개수만큼 visited 배열 생성 (방문여부 기록)

        for(int i =0; i < 5; i++){ // 노드의 개수, 배열의 개수X
            adjList.add(new ArrayList<>());
        }

        for(int[] a : arr){
            adjList.get(a[0]).add(a[1]);
//            양방향일 경우
//            adjList.get(a[1]).add(a[0]);
        }

//        System.out.println(adjList);
//        [[1, 2], [3], [3, 4], [], []]

        // bfs로 나오는 각 노드 방문하고 출력
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true; // 0번 노드는 일단 방문했다고 처리(초기화)
        while(!queue.isEmpty()){
            int temp = queue.poll();
            visited[temp] = true;
            System.out.println(temp);

            for(int target : adjList.get(temp)){
                // target을 queue에 add하기 전에 true로 세팅
                if(!visited[target]){
                    queue.add(target);
                    visited[target] = true; // queue에 add하는 시점에 방문처리 true
                }
            }
        }
    }
}
