package ProgrammersSolution;

import java.util.*;

// 프로그래머스 : 명예의 전당
public class Solution1 {
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;

//        Solution(k,score);
    }
}

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answerList = new ArrayList<>();
        // score가 모두 들어있는 우선순위 큐 (내림차 순)
        PriorityQueue<Integer> scoreQueue = new PriorityQueue<>(Comparator.reverseOrder());
        // 명예의 전당에 들어갈 score 저장하는 우선순위 큐
        PriorityQueue<Integer> answerQueue = new PriorityQueue<>();

        // scoreQueue에 score 모두 add
        for (int i = 0; i < score.length; i++) {
            scoreQueue.add(score[i]);
        }
        // 명예의 전당에 들어갈 answerQueue

        if(k > scoreQueue.size()){
            // scoreQueue사이즈가 k순위보다 적다면 모두 poll해서 add
            for(int i = 0; i<scoreQueue.size(); i++){
                answerQueue.add(scoreQueue.poll());
            }
        }else{
            // 그 외에는 k만큼만 poll해서 add
            for (int i = 0; i < k; i++) {
                answerQueue.add(scoreQueue.poll());
            }
        }

        answerList.add(answerQueue.poll());
//        System.out.println(Arrays.toString(answer.toArray()));
        int answer = answerQueue.poll();
        return new int[]{answer};
    }
}