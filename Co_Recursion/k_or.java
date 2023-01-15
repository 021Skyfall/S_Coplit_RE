package Co_Recursion;

import java.util.Arrays;

public class k_or {
    public static void main(String[] args) {
        boolean[] x = new boolean[]{true, true, false};
        System.out.println(or(x));
    }
    public static boolean or(boolean[] arr) {
        if (arr.length == 0) return false;
        boolean[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return arr[0]||or(tail);
    }
}
// 얘는 논리합임
// 하나라도 true 가 있으면 true 리턴
// 마찬가지로 연산은 연산자로 알아서 하게끔하고
// 이전이랑 같음 그냥
// 근데 대신 하나라도 true 면 true 리턴이니까
// 베이스 케이스를 false 로 해주고 비교해야함