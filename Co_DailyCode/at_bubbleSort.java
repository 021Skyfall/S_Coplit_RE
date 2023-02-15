package Co_DailyCode;

import java.util.Arrays;

public class at_bubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{2, 1, 3})));
    }
    private static int[] bubbleSort(int[] arr) {
//        return Arrays.stream(arr).sorted().toArray();

        // 전달인자 배열 길이 만큼 반복
        for (int i = 0; i < arr.length; i++) {
            // 정렬할게 있는지 체크
            int swaps = 0;
            // 비교 반복 체크
            // 가장 처음 요소부터 마지막 요소까지 반복 체크
            for (int j = 0; j < arr.length-1; j++) {
                // 이전 요소가 다음 요소보다 크다면 뒤로 가야함
                if (arr[j] > arr[j+1]) {
                    // 정렬 체크
                    swaps++;
                    // 새로운 함수 구현해서 배열 위치 조정
                    arr = swap(j,j+1,arr);
                }
            }
            // 정렬할게 없으면 break
            if (swaps == 0) {
                break;
            }
        }
        return arr;
    }
    private static int[] swap(int idx1, int idx2, int[] arr) {
        // 앞의 요소가 뒤로 가야함
        // 해당 로직
        // 큰 수 를 저장
        int temp = arr[idx1];
        // 다음 인덱스에 있던 작은 수를 큰 수가 있던 인덱스 자리로 교체
        arr[idx1] = arr[idx2];
        // 큰 수는 다음 인덱스 자리로 삽입
        arr[idx2] = temp;
        // 해당 위치 조정 배열 리턴
        return arr;
    }
}
