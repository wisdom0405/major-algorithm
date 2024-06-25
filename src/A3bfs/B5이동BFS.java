package A3bfs;

import java.util.*;

public class B5이동BFS {
    public static void main(String[] args) {
        int start = 5;
        int target = 17;

        // start ~ target까지 가는 가장 빠른 횟수
        // -1, +1, 현재숫자*2
        int result = bfs(5, 17,0);
        System.out.println(result);

    }
    static int bfs(int start, int target, int count){

        // 현재숫자, 타겟넘버, 연산한 횟수 count
        if(start == target){
            return count;
        }else{
            bfs(start + 1, target, count+1);
            bfs(start - 1, target, count+1);
            bfs(start * 2, target, count+1);
        }
        return -1;
    }
}
