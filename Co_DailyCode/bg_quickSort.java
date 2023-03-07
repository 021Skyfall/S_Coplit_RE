package Co_DailyCode;

import java.util.Arrays;

public class bg_quickSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(quickSort(new int[]{3, 1, 5, 13, 11, 17, 8, 4, 21})));
    }
    private static int[] quickSort(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
//        // 오름차순 정렬 (Arrays.sort X)
//        // 퀵정렬 알고리즘
//        if (arr.length==0) return arr;
//        // 좌우 기준 변수
//        int left = 0;
//        int right = arr.length - 1;
//
//        return sort(arr,left,right);
//    }
//    private static int[] sort(int[] arr, int left, int right) {
//        // 정렬
//        int part = partition(arr,left,right);
//        // 정렬된 결과로 바꿔주면서 재귀호출
//        if (left < part -1) arr = sort(arr, left, part-1);
//        if (right > part) arr = sort(arr, part, right);
//
//        return arr;
//    }
//    private static int partition(int[] arr, int left, int right) {
//        // 배열 중앙 지정후 디바이드앤 컨쿼
//        int pivot = arr[(left+right)/2];
//        // 좌축이 우측보다 작으면 정렬이 완료되지 않음
//        while (left <= right) {
//            // 좌측이 기준인 중앙보다 작다면 ++
//            while (arr[left] < pivot) left++;
//            // 우측이 기준인 중앙보다 크다면 --
//            while (arr[right] > pivot) right--;
//            if (left <= right) {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                right--;
//            }
//        }
//        return left;
    }
}
