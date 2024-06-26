package A5dp;

import java.util.Arrays;

public class D1DpBasic {
    public static void main(String[] args) {
//        1,4,5로 13을 만들 수 있는 조합 중에 가장 작은 조합의 개수
//        4와 5가 배수관계가 아니므로 greedy를 채택할 경우 최적의 해가 나오지 않음

//        12(13-1), 9(13-4), 8(13-5) 중에 가장 작은 조합을 가진 조합의 개수에 +1
//        Min(f(n-1), f(n-2)...) + 1
        int target = 13;
        int min = Integer.MAX_VALUE;
        int[] dp = new int[target + 1]; // 1부터 시작
        dp[0] = 0;
        dp[1] = 1; // {1}
        dp[2] = 2; // {1, 1}
        dp[3] = 3; // {1, 1, 1}
        dp[4] = 1; // {1, 1, 1}, {4}
        dp[5] = 1; // {5}

        for(int i = 6; i <= target; i++) {
            min = Math.min(dp[i-5],dp[i-4]);
            min = Math.min(min,dp[i-1]);
            dp[i] = min + 1;
        }
        // 13을 만들수 있는 조합 중 원소의 개수 최소값
        System.out.println(dp[13]); // 3
        System.out.println(Arrays.toString(dp));
//        [0, 1, 2, 3, 1, 1, 2, 3, 2, 2, 2, 3, 3, 3]

//        // 강사님 코드
//        int target = 13;
//        int[] arr = new int[target+1];
//        int[] numbers = {1,4,5};
//        arr[0] = 0;
//        arr[1] = 1;
//        for(int i=2; i<=target; i++) {
//            int min = Integer.MAX_VALUE;
//            for(int n : numbers){
//                if((i-n) >= 0 && min > arr[i-n]){
//                    min = arr[i-n];
//                }
//            }
//            arr[i] = min + 1;
//        }
//        System.out.println(arr[target]); // 3
//        System.out.println(Arrays.toString(arr));
//        // [0, 1, 2, 3, 1, 1, 2, 3, 2, 2, 2, 3, 3, 3]

    }
}
