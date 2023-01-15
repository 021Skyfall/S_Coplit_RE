package Co_Recursion;

import java.util.Arrays;

public class e_arrSum {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        System.out.println(arrSum(arr));
    }
    public static int arrSum(int[] arr) {
        if (arr.length == 0) return 0;
        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return arr[0] + arrSum(tail);
    }
}
// 간단하게 뜯어보면
// 베이스 케이스로 배열을 가장 작게 쪼갰을 때 = 배열이 비었을 때
// 합이니까 0 리턴해주고
// 인자로 입력되는 배열을 저장할 배열 선언
// 저장될 배열은 새로 만든 게 아니고 원 배열의 내욜을 복사함
// 대신 앞 대가리를 하나씩 때주던 뒤를 때주던 하나씩 때줘야
// 재귀 할 수록 요소가 하나씩 떨어져 나감
// 그리고 다시 돌아올때 때냈던 요소를 더해주는 방식