package A7이분탐색;

import java.util.Arrays;

public class B1Basic {
    static int[] arr;
    static int target;

    static void search(int start, int end){
        int mid = (int)(start+end)/2;
        for(int i = start; i <= end; i++){

        }

        if(target > arr[mid]){
            start = mid+1;
            search(start, end);
        }else if(target < arr[mid]){
            end = mid-1;
            search(start, end);
        }
    }

    public static void main(String[] args) {
//        이분탐색은 사전에 오름차순 정렬이 되어 있어야 가능한 알고리즘
        arr = new int[]{1,3,5,7,9,11,13,15,17,19};
        target = 17;
        int index = 0;
        int start = 0;
        int end = arr.length - 1;
        Arrays.sort(arr);

        while (start <= end){
            int mid = (int)(arr.length-1)/2;
            if(arr[mid] == target){
                index = mid;
            }else if (target > arr[mid]){
                // 만약 target이 중간값 보다 크다면
                start = mid + 1;
            }else{
                // 만약 target이 중간값 보다 작다면
                end = mid - 1;
            }
        }
        System.out.println(index);
//        System.out.println(Arrays.binarySearch(arr, 17));
    }
}
