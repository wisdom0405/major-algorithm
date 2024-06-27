package A6투포인터;

import java.util.*;

public class T1Basic {
    public static void main(String[] args) {
//        // 아래 배열에서 target이 될 수 있는 두 수의 조합의 값을 모두 찾아라
//        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6};
//        int target = 10;
//
//        // 2중 for문 : O(n^2) => 시간초과
//        List<int[]> list = new ArrayList<>();
//
//        for(int i=0; i < nums.length; i++){
//            for(int j = i+1; j < nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    list.add(new int[] {nums[i], nums[j]});
//                }
//            }
//        }
//        System.out.println("이중for문 이용");
//        for(int[] a : list){
//            System.out.println(Arrays.toString(a));
//        }
////            [7, 3]
////            [8, 2]
////            [9, 1]
////            [4, 6]
//
//        // 투포인터로 구현 : 배열 정렬 후 투포인터 이용 O(NlogN)
//        Arrays.sort(nums); // sort복잡도 : O(NlogN)
//        List<int[]> list2 = new ArrayList<>();
//        int start = 0;
//        int end = nums.length - 1;
//        while(start < end){ // 투 포인터 복잡도 : O(N)
//            if(nums[start] + nums[end] == target){
//                list2.add(new int[] {nums[start], nums[end]});
//                start++;
//                end--;
//            }else if(nums[start] + nums[end] < target){
//                // 두 수의 조합이 target보다 작을 때 start 인덱스 한칸 증가
//                start++;
//            }else{
//                // 두 수의 조합이 target보다 클 때 end 인덱스 한칸 내림
//                end--;
//            }
//        } // 총복잡도 : NlogN + N = O(NlogN)
//
//        System.out.println("투포인터 이용");
//        for(int[] a : list2){
//            System.out.println(Arrays.toString(a));
//            }
//
////            투포인터 이용
////            [1, 9]
////            [2, 8]
////            [3, 7]
////            [4, 6]

//        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6};
//        int target = 10;
//        int start = 0;
//        int end = 1;
//        List<int[]> list = new ArrayList<>();
//        // 구간의 합이 target이 되는 배열의 index의 처음과 끝을 리스트에 담기
//        int[] rangeSum = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            for(int j = 0; j <= i; j++){
//                rangeSum[i] += nums[j];
//            }
//        }
//        System.out.println("구간합 배열");
//        System.out.println(Arrays.toString(rangeSum));
//
//        while(start < end){
//            if(rangeSum[start] - rangeSum[end] == target){
//                list.add(new int[]{start,end});
//            }else if(rangeSum[start] - rangeSum[end] > target){
//                start++;
//            }else if(rangeSum[start] - rangeSum[end] < target){
//                end++;
//            }
//        }
//        System.out.println("결과");
//        for(int[] a : list){
//            System.out.println(Arrays.toString(a));
//        }

        // 강사님 코드
        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6};
        int target = 10;
        int start = 0;
        int end  = 0;
        int sum = nums[0];
        List<int[]> list = new ArrayList<>();
        while (start<=end && end<nums.length){
            if(sum == target){
                list.add(new int[]{start,end});
                sum-=nums[start];
                start++;
            }else if(sum  < target && end<nums.length-1){
                end ++;
                sum += nums[end];
            }else {
                sum -= nums[start];
                start++;
            }
        }
    }
}
