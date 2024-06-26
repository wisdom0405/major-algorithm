package A5dp;

import java.util.Arrays;

public class D2멀리뛰기 {
    public static void main(String[] args) {
        // 기억하기 방식
        int n = 4;
        // 식 : f(n) = f(n-1) + f(n-2)
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(Arrays.toString(arr));
    }

    class Solution {
        public long solution(int n) {
            long answer = 0L;
            int[] dp = new int[n]; // dp 테이블
            dp[n-1] = 1;
            dp[n-2] = 2;
            for (int i = n-3; i >= 0; i-- ){
                dp[i] = dp[i+1] + dp[i+2];
            }
            answer =  dp[0] % 1234567;
            return answer;
        }
    }
}
