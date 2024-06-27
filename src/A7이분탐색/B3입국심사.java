package A7이분탐색;

import java.util.Arrays;

public class B3입국심사 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7,10};

        // 심사시간 순대로 배열정렬
        Arrays.sort(times);

        int start = 0;
        int end = n * times[times.length - 1]; // 최대시간 : n명 * 제일 오래걸리는 심사시간
        int completed = 0; // 심사완료한 사람 수
        int time = times[times.length - 1];

        // 0분부터 동시에 심사관 수만큼 동시심사
        completed = times.length;

        while (start < end) {
            int mid = (start + end) / 2;

            for(int t : times){

            }

        }



    }
    class Solution {
        public long solution(int n, int[] times) {
            Arrays.sort(times);
            long s = 0, e = (long)times[times.length - 1] * n;
            long ans = e+1;

            while(s <= e) {
                long mid = (s + e) / 2;
                boolean isOk = can(mid, n, times);
                if(isOk) { // 가능
                    ans = mid;
                    e = mid-1;
                } else { // 시간을 늘려야한다.
                    s = mid+1;

                }
            }
            return ans;
        }
    }
    private static boolean can(long t, int n, int[] times) {
        long people = 0;
        for(int time : times) {
            people += (t / time);
        }

        return people >= n;
    }
}
