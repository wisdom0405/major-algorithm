package CodingFestival;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
// 풀다 말았심

public class Boj오큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 배열의 크기
        int[] arr = new int[N]; // 배열선언
        int[] RB = new int[N]; // 오큰수 배열
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String line = st.nextToken();

        // 배열 입력 받음
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(line.substring(i,i+1));
        }

        // 배열의 마지막요소부터 stack에 push
        stack.push(arr[N-1]);
        RB[N-1] = -1; // 배열 맨 마지막 요소의 오큰수는 없는게 고정이므로 -1 fix

        for(int i = N-2; i >= 0; i--) {
            int tmp = stack.peek(); // stack의 맨 위 요소
            if(tmp > arr[i]){ // 오큰수 발견하면
                RB[i] = tmp; // 해당 요소의 오큰수로 저장
                stack.push(arr[i]); // 그리고 stack에 저장
            }else{
                // tmp < arr[i] 라면
                while(stack.peek() <= arr[i]){ // arr[i]보다 큰값이 나올 때까지 pop
                    if(stack.isEmpty()){ // 만약 stack이 비어있다면 오큰수가 없다는 뜻이므로 오큰수로 -1저장
                        RB[i] = -1;
                        stack.push(arr[i]);
                    }
                    stack.pop();
                }
            }

        }

    }
}
