package Co_DailyCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class bi_radixSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(radixSort(new int[]{2, 7, 3, 4, 16, 8, 22, 6, 1})));
    }
    private static int[] radixSort(int[] arr) {
//        return Arrays.stream(arr).sorted().toArray();

        // 돌아가면서 배열의 최대값을 구함
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        // sort 메서드를 정의 후 사용하여 자릿수 기준으로 정렬
        for (int digit = 1; digit <= maxValue; digit*=10) {
            arr = sort(arr,digit);
        }
        return arr;
    }

    private static int[] sort(int[] arr, int digit) {
        int[] temp = new int[arr.length]; // 임시 배열
        int[] counting = new int[10]; // 카운팅 배열

        for (int i = 0; i< arr.length; i++) {
            // 해당 자리수의 숫자 추출
            int num = (arr[i] / digit) % 10;
            counting[num]++;
        }

        // 누적된 합을 배열로
        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        // 배열의 가장 마지막 인덱스 부터 시작,
        // 가장 큰수가 뒤로 정렬되어야하기 떄문에,
        // 안정적으로 정렬하기 위해 마지막 요소부터 순회
        for (int i = arr.length - 1; i >= 0; i--) {
            // 현재 배열의 자릿수
            int num = (arr[i] / digit) % 10;
            // 해당 자릿수를 인덱스로 counting 배열의 요소를 1씩 뺀 후,
            counting[num]--;
            // 구한 값을 인덱스로 배열의 요소 삽입
            temp[counting[num]] = arr[i];
        }

        // 연산이 끝난 배열 반환
        return temp;
    }
}
