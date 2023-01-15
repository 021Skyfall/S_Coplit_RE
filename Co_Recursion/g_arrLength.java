package Co_Recursion;

import java.util.Arrays;

public class g_arrLength {
    public static void main(String[] args) {
        int[] x = new int[]{1, -2, 1, 3};
        System.out.println(arrLength(x));
    }
    public static int arrLength(int[] arr) {
        if(arr.length==0) return 0;
        int[] tail = Arrays.copyOfRange(arr,0,arr.length-1);
        return 1 + arrLength(tail);
    }
}
// 걍 length 쓰면 되는걸 왜 하는진 모르겠지만 재귀 연습이니
// 일단은 재귀 호출로 배열 요소를 하나씩 빼주는 함수가 실행되었을 때가 1회라고 하면
// 앞을 때던 뒤를 때던
// 여튼 그냥 실행될때마다 1 더하면 됨