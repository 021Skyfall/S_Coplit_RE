package Co_DailyCode;

import java.util.Arrays;

public class bh_insertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{3, 1, 22, 4, 2})));
    }
    private static int[] insertionSort(int[] arr) {
        // 반복해서 이전 요소가 타겟으로 지정된 숫자보다 커지기까지 모든 수를 한칸 씩 밀어냄
        for (int i = 1; i < arr.length; i++) {
            // 임의로 숫자를 정함
            int target = arr[i];
            // 타겟 이전의 요소를 저장
            int j = i - 1;
            // 없을 경우 j가 0보다 작아지면 안됨 & 타겟보다 타겟 이전의 숫자가 더 커지면 다음 인덱스로
            while (j>=0 && target < arr[j]) {
                // 자리 교체
                arr[j+1] = arr[j];
                // 인덱스를 줄이고 위의 조건에 해당하면 다시 for 문 으로
                j--;
            }
            // while 을 빠져나온 뒤 다음 인덱스를 지정
            arr[j+1] = target;
        }
        return arr;
    }
}
