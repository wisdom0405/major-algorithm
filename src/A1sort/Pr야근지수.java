package A1sort;

import java.util.Comparator;
import java.util.PriorityQueue;

import static java.lang.Math.pow;


public class Pr야근지수 {
    public static void main(String[] args) {
        int[] works  = {4,3,3};
        int n = 4;
        Solution2 sol = new Solution2();
        long result = sol.solution(n,works);
        System.out.println(result);
    }
}
class Solution2 {
    public Long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for (int w : works){
            pq.offer(w);
        }

//        while(!pq.isEmpty()){
//            for (int i =0; i < n; i++){
//                    int newWork = pq.poll() - 1;
//                    pq.offer(newWork);
//            }
//        }

        for (int i =0; i < n; i++){
            if(pq.isEmpty())break;
            int temp = pq.poll();
            pq.add(temp-1);
        }

        for(int i = 0; i < pq.size(); i++){
            if(pq.poll() > 0){
                answer += pow(pq.poll(),2);
            }
            else return 0L;
        }

        return answer;
    }
}
