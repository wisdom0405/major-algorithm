package A1sort;

import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};
//        // 최대힙구성
//        maxHeap(arr, 1);
//        System.out.println(Arrays.toString(arr));

//        // 최초힙 구성
//        for(int i = arr.length/2-1; i>=0; i--){
//            heapify(arr, arr.length-1 ,i);
//        }
//
//        // 루트노드와 최하위노드를 change하면서 heapify
//        for(int i = arr.length-1; i>=0; i--){
//            int temp = arr[i];
//            arr[i] = arr[0];
//            arr[0] = temp;
//            heapify(arr, i, 0);
//        }
//        System.out.println(Arrays.toString(arr));

        int[] arr2 = {7,6,5,8,3,5,9,1,6};
        Queue<Integer> pq = new PriorityQueue<>();
        for(int a : arr2){
            pq.add(a);
        }
        // 힙자료구조를 가지고 있는 큐(정렬된 결과X)
        // add : 상향식 heapify
        // poll : 하향식 heapify
        System.out.println(pq); // [1, 3, 5, 5, 7, 6, 9, 8, 6]

    }
    static void maxHeap(int[] arr, int parentIndex) {
        // parameter : int배열, 부모노드 인덱스
            int parent = parentIndex; // 부모 index
            int leftChild = parentIndex * 2 + 1; // 왼쪽자식 index
            int rightChild = parentIndex * 2 + 2; // 오른쪽자식 index

        // 만약 자식노드가 양쪽에 있다면 -> 자식노드 양쪽검사
            if(rightChild <= arr.length) {
                // 왼쪽자식이 부모노드, 오른쪽자식 노드보다 클 경우
                if(arr[leftChild] > arr[parent] && arr[leftChild] > arr[rightChild] ) {
                    swap(arr, arr[leftChild], arr[parent]); // 왼쪽 자식과 부모자리 change
                    maxHeap(arr, leftChild); // 다음부모는 leftChild
                }
                // 오른쪽자식이 부모노드, 왼쪽자식 노드보다 클 경우
                if(arr[rightChild] > arr[parent] && arr[rightChild] > arr[leftChild] ) {
                    swap(arr, arr[rightChild], arr[parent]); // 오른쪽 자식과 부모자리 change
                    maxHeap(arr, rightChild); // 다음부모는 rightChild
                }
            }else if(leftChild <= arr.length && rightChild > arr.length) {
                // 왼쪽자식만 있다면
                if(arr[parentIndex] < arr[leftChild] ) {}
            }

    }

    static void swap(int[] arr, int i, int j){
        // 인덱스 i,j 서로 자리바꿈
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void heapify(int[] arr, int arrLength, int node){
        // 왼쪽노드 : node * 2 + 1
        // 오른쪽노드 : node * 2 + 2
        int left = node * 2 + 1;
        int right = node * 2 + 2;

        // check1 : 왼쪽,오른쪽 노드가 배열의 길이보다 짧아야 함.
        if(left > arrLength) return;
        if(right > arrLength){
            // node랑 left만 비교
            if(arr[node] > arr[left]){
                int temp = arr[node];
                arr[node] = arr[left];
                arr[left] = temp;
                heapify(arr, arrLength, left);
            }

        }else{
            // node, left, right 모두 비교
            int index = 0;
            if(arr[node] > arr[left] || arr[node] > arr[right]){
                if(arr[left] > arr[right]){
                    index = right;
                }else{
                    index = left;
                }
                int temp = arr[node];
                arr[node] = arr[index];
                arr[index] = temp;
                heapify(arr, arrLength, index);
            }
        }
        // check2 : node를 제외한 node, left, right 세개 중 가장 작은 노드로 다시 heapify
    }
}
