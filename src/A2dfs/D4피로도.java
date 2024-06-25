package A2dfs;
import java.util.*;
public class D4피로도 {
    public static void main(String[] args) {
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        int k = 80;



    }

}
class Solution {
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;
    public int solution(int k, int[][] dungeons) {
       int answer = -1;
       dfs(dungeons,k,0);
        return answer;
    }
    static void dfs(int[][] dungeons,int k ,int count){
        if(count > max){
            max = count;
        }
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i] && k >= dungeons[i][0]){
                dfs(dungeons, k-dungeons[i][1], count+1);
            }
        }
    }

}