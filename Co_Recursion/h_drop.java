package Co_Recursion;

import java.util.Arrays;

public class h_drop {
    public static void main(String[] args) {
        int[] x = new int[]{1, -2, 1, 3};
        System.out.println(Arrays.toString(drop(2,x)));
    }
    public static int[] drop(int num, int[] arr) {
        if (num == 0) return arr;
        int[] tail = Arrays.copyOfRange(arr,1,arr.length);
        return drop(num-1,tail);
    }
}
// 이건 베이스 케이스 정하기가 어렵다
// 일단 num 개의 요소가 앞에서 부터 지워진 arr 을 리턴하는 건데
// 좀 쉽게 보려고 빈 배열을 입력 받았을 때의 엣지 케이스를 지워버렸다
// num 이 0 이 될때까지 반복하고 거기서 딱 멈춰 해당 차수까지 이뤄진 재귀를 멈추고 리턴하는 건데
// 말이 좀 어렵고 코드를 뜯어보면 쉽?다
// 일단 배열의 요소를 지워야하니까 복붙 해놓은 tail 지정하고
// 재귀는 num-1 일 계속 이뤄지는 만큼 요소를 하나씩 던진다
// 이후 num 이 1씩 빠지다가 0이 된 순간 재귀가 끝나고
// 해당 배열이 리턴된다
// 더 자세한 내용은 재귀 코플릿 커밋에 있기때문에 여기서 줄인다