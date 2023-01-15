package Co_Stream;

import java.util.Arrays;

public class h_findBiggestNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 10, 5, 32, 5};
        System.out.println(findBiggestNumber(arr));
    }
    public static Integer findBiggestNumber(int[] arr) {
//        return Arrays.stream(arr).max().orElse(0);
        return !(arr.length == 0) ? Arrays.stream(arr).max().getAsInt() : null;
    }
}
// 이게 orElse() 로는 null 을 리턴할 수가 없네
// 지금 배열의 타입이 int 라 타입 안맞아서 그런데
// 그럼 주의사항에 빈배열이면 null 출력하랬으니까
// 결국 엣지 케이스 if 문을 넣어줘야겠네
// 일단 문제 자체는 간단하게 max 메소드 쓰라는 거고
// 그럼 if 말고 삼항연산자 써볼랭