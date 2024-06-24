package A3bfs;

import java.awt.*;

import java.util.*;
import java.util.List;

public class B4가장먼노드 {
    public static void main(String[] args) {
        int n = 6;
        int [][] vertex = {{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};

    }
}
class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        List<List<Integer>> adjList = new ArrayList<>();
        boolean[] visited = new boolean[n+1]; // 방문여부 (노드 1번부터 시작)
        int[] distance = new int[n+1]; // 노드 간 거리 (노드 1번부터 시작)
        Arrays.fill(distance,1);

        for (int i = 0; i < n+1; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int[] a : edge){
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]); // 양방향 간선
        }

        queue.add(1);
        visited[1] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();
            for(int target : adjList.get(temp)){
                if(!visited[target]){
                    queue.add(target);
                    distance[target] = distance[temp] + 1;
                    visited[target] = true;
                }
            }
        }

        int maxDistance = Arrays.stream(distance).max().getAsInt();
        int count = (int)Arrays.stream(distance).filter(a->a==maxDistance).count();

        return count;
    }
}