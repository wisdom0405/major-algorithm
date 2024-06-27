package A7이분탐색;

import java.util.Arrays;

public class B2Basic2 {
    public static void main(String[] args) {
//         target을 찾되, target이 없으면 target보다 큰 값중에 첫번째 값의 index를 찾아라
        int[] arr = {1,3,4,5,7,8,9};
        int target = 6;
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        Arrays.sort(arr);
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                index = mid;
            }else if(target < arr[mid]){
                index = mid;
                end = mid-1;
            }else{
                // target > arr[mid]인 경우
                start = mid+1;
            }
        }
        System.out.println(index); // 4

        // 가까운 값 찾기
        int[] arr2 = {10,20,30};
        System.out.println(Arrays.binarySearch(arr2,35)); // -4
        System.out.println(Arrays.binarySearch(arr2,25)); // -3
        System.out.println(Arrays.binarySearch(arr2,9)); // -1

        int index2 = Arrays.binarySearch(arr,target);
        // arr에서 target을 찾는데 target이 없는 경우도 활용가능
        if(index2 < 0){
            System.out.println(Math.abs(index2)-1);
        }else{
            System.out.println(index2);
        }
    }
}
