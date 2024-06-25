package A2dfs;
import java.util.*;

public class D7여행경로2 {
    static String[][] ticket;
    static boolean[] visited;
    static List<String> answer;
    public static void main(String[] args) {

    }
    class Solution {
        public String[] solution(String[][] tickets) {
            ticket = tickets;
            visited = new boolean[tickets.length];
            answer = new ArrayList<>();

            dfs(0,"ICN","ICN");
            Collections.sort(answer);

            return answer.get(0).split(" ");
        }
    }
    static void dfs(int depth, String departure, String path){
        // 종료구문
        if(depth == ticket.length){
            answer.add(path); // 모든경로를 모두 돌면 answer에 list추가
            return;
        }
        // 수행구문
        for(int i = 0; i < ticket.length; i++){
            if(!visited[i] && ticket[i][0].equals(departure)){
                // 아직방문하지 않았고 티켓의 출발지가 departure와 같다면
                visited[i] = true; // 방문처리
                dfs(depth+1, ticket[i][1], path + " " + ticket[i][1]);
                visited[i] = false; // 백트래킹을 위해서 방문처리 해제
            }
        }
    }
}

