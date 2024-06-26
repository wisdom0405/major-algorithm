package A4greedy;
import java.util.*;
public class G2체육복 {
    public static void main(String[] args) {
        int n = 5; // 전체 학생수
        int[] lost = {2,4}; // 체육복 도난당한 학생번호
        int[] reserve = {1,3,5}; // 여벌체육복을 가지고 있는 학생번호

    }
    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int count = 0;
            int lostNum = lost.length;
            Arrays.sort(lost);
            Arrays.sort(reserve);

            for(int i = 0; i < reserve.length; i++){
                for(int j = 0; j < lost.length; j++){
                    if(reserve[i] == lost[j] || reserve[i] + 1 == lost[j] || reserve[i] - 1 == lost[j]){
                        lost[j] = -1; // 잃어버린 학생한테 체육복 줌(해결)
                        reserve[i] = - 999; // 여벌 체육복 빌려줘서 이제 못 빌려줌
                        count++;
                    }
                }
            }
            lostNum -= count;

            return n - lostNum;
        }
    }
}
