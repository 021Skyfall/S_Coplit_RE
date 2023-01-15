package Co_Recursion;

import java.util.Arrays;

public class f_arrProduct {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 1, 3};
        System.out.println(arrProduct(arr));
    }
    public static int arrProduct(int[] arr) {
        if (arr.length == 0) return 1;
        int[] tail = Arrays.copyOfRange(arr,0,arr.length-1);
        return arr[arr.length-1] * arrProduct(tail);
    }
}
// 지금은 곱이고
// 전 Sum 에서는 배열 요소의 맨 첫번째 요소를 때네서 재귀호출 했으니
// 이번엔 맨 뒷 요소 때서 곱해봄