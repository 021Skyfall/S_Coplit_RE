package Co_DailyCode;

import java.util.Arrays;

public class bj_mergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{3, 1, 5, 2, 7, 9, 6})));
    }

    private static int[] mergeSort(int[] arr) {
        sort(arr,0,arr.length-1);
        return arr;
    }

    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            // 중간 idx 구함
            int mid = (left + right) / 2;
            // 중간 idx를 기준으로 divide
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            // 정렬, 병합
            merge(arr, left, right, mid);
        }
    }
    private static void merge(int[] arr,int left, int right, int mid) {
        // 임시 배열에 기존 배열 복사
        int[] sorted = Arrays.copyOfRange(arr,0,arr.length);

        // 좌측 인덱스
        int l = left;
        // 우측 인덱스
        int r = mid + 1;
        // 정렬된 값을 병합된 배열에 넣을 인덱스
        int idx = left;

        // 좌측 배열, 우측 배열 중 하나의 요소가 전부 없어질 떄까지 반복
        while(l <= mid && r <= right) {
            if (sorted[l] <= sorted[r]) {
                arr[idx++] = sorted[l++];
            } else {
                arr[idx++] = sorted[r++];
            }
        }

        // 좌측 배열에 요소가 남았을 경우, 남은 요소를 삽입
        for (int i = 0; i <= mid-l; i++) {
            arr[idx+i] = sorted[l+i];
        }
    }
}
//    private static int[] mergeSort(int[] arr) {
//        // 병합 정렬
////        return Arrays.stream(arr).sorted().toArray();
//
//        return sort(arr, 0, arr.length - 1);
//    }
//
//    private static int[] sort(int[] arr, int left, int right) {
//        if (left == right) return arr;
//
//        int mid = (left + right) / 2;
//
//        sort(arr, left, mid);
//        sort(arr, mid + 1, right);
//
//        return merge(arr, left, mid, right);
//    }
//
//    private static int[] merge(int[] arr, int left, int mid, int right) {
//        int l = left;
//        int r = mid + 1;
//        int idx = left;
//        int[] sorted = new int[arr.length];
//
//        if (arr[l] <= arr[r]) {
//            sorted[idx] = arr[l];
//            idx++;
//            l++;
//        } else {
//            sorted[idx] = arr[r];
//            idx++;
//            r++;
//        }
//        if (l > mid) {
//            while (r <= right) {
//                sorted[idx] = arr[r];
//                idx++;
//                r++;
//            }
//        } else {
//            while (l <= mid) {
//                sorted[idx] = arr[l];
//                idx++;
//                l++;
//            }
//        }
//        for (int i = left; i <= right; i++) {
//            arr[i] = sorted[i];
//        }
//        return sorted;
//    }
//}
