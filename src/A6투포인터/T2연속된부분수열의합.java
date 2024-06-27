package A6투포인터;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 풀다 말았심
public class T2연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1,1,1,2,3,4,5};
        int k = 5;

        int start = 0; // 구간합 start포인터
        int end = 0; // 구간합 end포인터
        int[] answer = new int[2]; // 부분배열의 인덱스
        int[] partSeq = new int[sequence.length];
        List<int[]> partList = new ArrayList<int[]>(); // 조건에 부합하는 부분수열 인덱스값 저장리스트

        // 부분배열의 구간합 배열 구하기
        for(int i=0; i<sequence.length; i++) {
            for(int j=0; j <=i; j++){
                partSeq[i] += sequence[j];
            }
        }
        System.out.println("부분배열의 구간합 배열");
        System.out.println(Arrays.toString(partSeq));



//        while(start <= end && end + 1 < partSeq.length) {
//            if(partSeq[start] == k) {
//                partList.add(new int[]{start,end});
//            }
//        }

    }
    class Solution {
        public int[] solution(int[] sequence, int k) {
            int[] answer = {};

            return answer;
        }
    }
}
