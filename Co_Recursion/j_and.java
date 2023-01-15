package Co_Recursion;

import java.util.Arrays;

public class j_and {
    public static void main(String[] args) {
        boolean[] x = new boolean[]{false,false,false};
        System.out.println(and(x));
    }
    public static boolean and(boolean[] arr) {
        if (arr.length == 0) return true;
        boolean[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return arr[0]&&and(tail);
    }
}
// 얘는 그냥 연산자 써서 알아서 계산하게 하면됨
// 쉽게 말해 boolean 의 논리 곱인데
// false 가 하나라도 있으면 false 인것
// 그럼 일단 일반 배열하듯이 tail 만들어서 앞부터 하나씩 지워줌
// 그런 다음에 arr 의 0 번 째 인덱스를 놓고 재귀 들어가서 또 지우고
// 반복해서 들어갔다가 다시 빠져나오면서 잘라낸 대가리랑 && 연산자로 비교함
// 비교하는 도중 하나라도 false 가 있으면 false 출력
// 끝
