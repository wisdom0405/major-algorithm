package A4greedy;
import java.util.*;

// 강사님 코드
public class G3구명보트2 {
    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        int limit = 100;
        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();

        for(int p : people){
            deque.add(p);
        }

        int answer = 0;
        while(!deque.isEmpty()){
            int max = deque.pollLast(); // 몸무게 최대값인 사람
            answer++;
            if(!deque.isEmpty() && max + deque.peekFirst() <= limit){ // 최대 + 최소 =< limit
                deque.pollFirst();
            }
        }

    }
}
