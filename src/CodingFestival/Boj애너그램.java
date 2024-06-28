package CodingFestival;

import java.io.*;
import java.util.*;

public class Boj애너그램 {
    static ArrayList<char[]> wordList; // 입력받은 단어 한글자씩 잘라서 저장하는 리스트
    static ArrayList<char[]> anagram;
//    static TreeSet<Character> anaSet;
//    static PriorityQueue<Character> pq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        wordList = new ArrayList<>(); // 단어저장

        for(int i =0; i<N; i++){
            char[] stChar = br.readLine().toCharArray(); // 받은문자 한글자씩 잘라서 char배열 생성
            Arrays.sort(stChar); // 단어 글자 정렬
            wordList.add(stChar); // 단어리스트에 char배열 추가
        }
//        System.out.println(Arrays.deepToString(stList.toArray())); // [[a, b, c], [a, c, b, a]]

        for(int i =0; i<N; i++){
            toAnagram(wordList.get(i));
        }

    }
    static void toAnagram(char[] ch){
        for(int i = 0; i<ch.length; i++){

        }
    }

}
