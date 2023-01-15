package Co_Stream;

import java.util.Arrays;

public class l_isHot {
    public static void main(String[] args) {
        int[] temperature = {25, 29, 30, 31, 26, 30, 33};
        System.out.println(isHot(temperature));
    }
    public static boolean isHot(int[] temperature) {
        return Arrays.stream(temperature).filter(e -> e >= 30).count() >= 3;
    }
}
// 이거 좀 헷갈릴 수 있는데
// boolean 계산 자체를 자바한테 넘기는 거임
// 쉽게 말해서 지금 리턴 값은
// return 1 >= 3 이런거임
// >= 연산자가 있고
// 리턴 타입이 boolean 이라 가능함