package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T4슬라이딩윈도우 {
    public static void main(String[] args) {
//        정수 배열 nums와 정수 k가 주어졌을 때
//        길이가 k인 연속된 부분 배열의 최대합을 구하기
        int[] nums = {1,4,2,10,23,3,1,0,20};
        int k = 4;
//        int max = Integer.MIN_VALUE;
//        int partSum = 0;
//
//        for (int i = 0; i < nums.length-k; i++) {
//            partSum = Arrays.stream(nums,i,i+k).sum();
//            System.out.println(partSum); // 부분배열 합
//            max = Math.max(max, partSum);
//        }
//
//        System.out.println("부분배열합의 최댓값은 "+max);

        // 강사님 코드
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        for(int i=k; i<nums.length; i++){
//            sum += (nums[k] - nums[i-k]);
            sum += nums[i];
            sum -= nums[i-k];
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
