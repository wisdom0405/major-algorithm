package A4greedy;
import java.util.*;

public class G1GreedyBasic {
    public static void main(String[] args) {
        // 1,5,10,20 숫자를 조합하여 99를 만들 수 있는 조합 중 가장 짧은 조합의 길이
        // 숫자 모두 써야하는건 아님
        // 조합 숫자들이 서로의 배수로 이루어져있으므로 제일 큰수를 제일 많이 쓰는게 유리 -> greedy
        // 조합 숫자들이 서로의 배수가 아닐 경우 제일 큰 수를 많이 쓰는것이 최적의 해를 보장하지 않음 -> dp
        int n = 99;
        int[] arr = {1,5,10,20};
        Arrays.sort(arr);

//        while(n > 0){
//            for(int i)
//        }

    }
}
