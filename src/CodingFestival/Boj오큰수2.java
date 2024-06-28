package CodingFestival;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// 세정님 코드
public class Boj오큰수2 {
    // 아이디어: 스택에 들어있는 수가 증가되도록 저장.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        int[] inputs = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; ++i) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[N];
        result[N-1] = -1;
        for(int i=0; i<N; ++i) { // 맨 나중에 입력된 값부터 진행해야한다.
            int idx = N - 1 - i;
            int cur = inputs[idx];

            if(dq.isEmpty()) { // 1. 스택이 비어있는 경우 => 오큰수가 없으므로 -1을 저장하고 자기자신을 스택에 저장
                result[idx] = -1;
                dq.addFirst(inputs[idx]);
            } else if(cur < dq.peekFirst()) { // 2. 현재 수가 스택의 top 보다 작은 경우 => 스택 top이 오큰수이다.
                result[idx] = dq.peekFirst();
                dq.addFirst(cur);
            } else { // 3. 현재 수가 스택 top보다 큰 경우 => 오큰수가 있을 수도 없을 수도 있으므로 찾아야한다.
                while(!dq.isEmpty() && dq.peekFirst() <= cur) { // => 스택이 비거나, 오큰수가 나올때까지 스택에서 pop하기 (주의: 같은 수는 오큰수가 아니므로, 같거나 클때까지 빼주어야한다)
                    dq.pollFirst();
                }
                if(dq.isEmpty()) { // 3 - 1. 스택이 비었다면 오큰수가 없다.
                    result[idx] = -1;
                    dq.addFirst(cur);
                } else { // 3 - 2. 스택에 cur보다 큰 수가 있으므로, 그 수가 오큰수이다.
                    result[idx] = dq.peekFirst();
                    dq.addFirst(cur);
                }
            }
        }

        // 정답 출력 부분
        for(int i=0; i<N; ++i) {
            bw.write(result[i] + " ");
        }
        bw.flush();
    }
}
