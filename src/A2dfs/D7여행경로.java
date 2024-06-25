package A2dfs;
import java.util.*;

public class D7여행경로 {
    static boolean[] visited;
    static Queue<String> route = new LinkedList<>(); // 여행경로 담음

    public static void main(String[] args) {

    }
    class Solution {
        public String[] solution(String[][] tickets) {

            visited = new boolean[tickets.length];

            for(int i = 0; i < tickets.length; i++){
                if(visited[i]) continue; // i번째 배열의 항공권 사용했을 경우 continue
                bfs(i, tickets);//항공권을 사용하지 않았을 경우 bfs 호출
            }
            String[] answer = route.toArray(new String[route.size()]);
            return answer;
        }
    }
    static void bfs(int index, String[][] tickets){
        Queue<Integer> queue = new LinkedList<>(); // 인덱스 담음

        queue.add(index);
        visited[index] = true; // index번째 항공권 사용완료

        while(!queue.isEmpty()){
            int current = queue.poll();
//            String departure = tickets[current][0];
            String arrival = tickets[current][1];
//            route.add(departure);
            route.add(arrival);
            int nextIndex = Arrays.asList(tickets).indexOf(arrival);
            visited[nextIndex] = true;
            queue.add(nextIndex);
        }

    }
}
