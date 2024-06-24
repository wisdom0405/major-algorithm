package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class D3Basic3 {
    static List<List<Integer>> adjList; // 인접노드 이중리스트

    public static void main(String[] args) {
        // 단방향 그래프
        // 완전탐색 : 갈수있는 모든 경로 리스트에 저장
        int[][] arr = {{1,2},{1,3},{2,4},{2,5},{3,6},{3,7},{4,8},{4,9},{5,10}};
        // [[1,2,4,8],[1,2,4,9],[1,2,5,10],[1,3,6],[1,3,7]]

        // 1) 1부터 시작한다 => list, 배열 1개 넉넉하게 잡으면 된다.
        // 2) 방문경로를 모두 list에 담기 => 1 2 3 4 8... 1 2 5 ...
        adjList = new ArrayList<List<Integer>>();
        for (int i = 0; i < 11; i++){
            adjList.add(new ArrayList<>());
        }

        for (int [] a : arr){
            adjList.get(a[0]).add(a[1]);
        }
        List<List<Integer>> answer = new ArrayList<>();// 전체리스트
        List<Integer> temp = new ArrayList<>(); // 부분리스트
        // temp 리스트에 1번 노드 미리 담아줌
        temp.add(1);
        dfs(answer, temp, 1);

    }
    static void dfs(List<List<Integer>> answer, List<Integer> temp, int start){
        // 인접한 노드가 없으면 전체경로 리스트에 temp리스트 더하고 끝냄
        if(adjList.get(start).isEmpty()){
            answer.add(new ArrayList<>(temp));
            return;
        }

        for(int target : adjList.get(start)){
                temp.add(target);
                dfs(answer, temp, target);
                // 더 이상 인접한 노드가 없으면 마지막 노드 삭제 후 이전 노드로 백트래킹
                temp.remove(temp.size()-1);
        }

    }
}
