package A2dfs;
import java.util.*;
public class D4피로도 {
    public static void main(String[] args) {
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        int k = 80;



    }

}
class Solution {
    public int solution(int k, int[][] dungeons) {
        List<List<Integer>> dungeonList = new ArrayList<>();
        boolean[] visited = new boolean[dungeons.length];
        int current = k;
        int answer = -1;

        for(int i =0; i < dungeons.length; i++){
            dungeonList.add(new ArrayList<>());
        }

        while (current > 0) {
            for(int i = 0; i < dungeons.length; i++){
                if(k >= dungeons[i][0]){

                }
            }
        }
        return answer;
    }
    static void combi(int[][] dungeons) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> dungeonList = new ArrayList<>();
        for(int i = 0; i < dungeons.length -1; i++){
            dungeonList.add(new ArrayList<>());

        }

    }
}