package A2dfs;

import java.util.*;

public class D6타겟넘버 {
    static int[] numbers;
    static int target;
    static int count;
    static int answer;
    void dfs(int index, int sum){
        if(index == numbers.length){
            if(sum == target){
                count++;
            }
            return;
        }
        dfs(index+1, sum+numbers[index]);
        dfs(index+1, sum-numbers[index]);
    }
    class Solution {
        public int solution(int[] numbers, int target) {
            dfs(0, 0);
            return count;
        }
    }


    static void dfs2(int[] numbers, int target, int length, int total){
        if(length == numbers.length && total == target){
            answer++;
        }
//        dfs(numbers, target, length+1, total+numbers[length])
    }


//    static void dfs(int[] numbers,int index, int sum, int target, int count){
//
//        if(sum == target){
//            count++;
//        }
//        else{
//            dfs(numbers,index+1,sum + numbers[index+1],target, count);
//            dfs(numbers,index+1,sum - numbers[index+1],target, count);
//        }
//
//        for(int i = 0; i < numbers.length; i++){
//            dfs(numbers, i, sum + numbers[i], target, 0);
//            dfs(numbers, i, sum - numbers[i], target, 0);
//            if(index == numbers.length-1){}
//        }
    }


