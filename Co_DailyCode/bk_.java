package Co_DailyCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class bk_ {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(heapSort(new int[]{5, 4, 3, 2, 1})));
    }
    private static int[] heapSort(int[] arr) {
        // 힙 자료구조를 사용하기 위해 큐 사용
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // 배열을 힙으로 변환
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }

        // 힙 안에서 우선 순위가 가장 높은 요소를 하나씩 뽑아 배열로 삽입
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }

        return arr;
    }
}
