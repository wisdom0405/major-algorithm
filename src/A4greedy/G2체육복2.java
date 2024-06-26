package A4greedy;
import java.util.*;
public class G2체육복2 {
    public static void main(String[] args) {
        int n = 5; // 전체 학생수
        int[] lost = {2,4}; // 체육복 도난당한 학생번호
        int[] reserve = {1,3,5}; // 여벌체육복을 가지고 있는 학생번호
        Arrays.sort(reserve);
        Set<Integer> lostSet = new HashSet<>();
        for(int l : lost){
            lostSet.add(l);
        }
        for(int i = 0; i < reserve.length; i++){
            if(lostSet.contains(reserve[i])){
                lostSet.remove(reserve[i]);
                reserve[i] = -1;
            }
        }
        for(int i = 0; i < reserve.length; i++){
            if(reserve[i] == -1) continue;
            if(lostSet.contains(reserve[i]-1)){
                lostSet.remove(reserve[i]-1);
            } else if (lostSet.contains(reserve[i]+1)) {
                lostSet.remove(reserve[i]+1);
            }
        }
        System.out.println(n - lostSet.size());
    }
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        return answer;
    }
}
