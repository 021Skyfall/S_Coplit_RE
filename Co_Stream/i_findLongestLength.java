package Co_Stream;

import java.util.Arrays;

public class i_findLongestLength {
    public static void main(String[] args) {
        String[] strArr = {"codestates", "java", "backend", "programming"};
        System.out.println(findLongestLength(strArr));
    }
    public static int findLongestLength(String[] strArr) {
//        return Arrays.stream(strArr).mapToInt(String::length).max().orElse(0);
        return Arrays.stream(strArr).mapToInt(String::length)
                .reduce(0,Math::max);
    }
}
// 이건 그냥 간단하게 배열 요소들 순회하면서
// 그 요소들 길이를 int 타입의 숫자로 바꾸고
// max 로 그 중 가장 큰거 리턴하는거네
// 아래는 순회는 같은데 reduce 를 쓰고 int 타입 그대로 리턴하는 건데
// 이전 다음 순회하는 reduce 메소드의 특성을 이용한것
// 람다식은 Math 클래스의 max 메소드를 사용해서 이전의 요소와 다음의 요소를 비교해서 최대값인거 출력하게 하는거
// 근데 굳이?싶네
// 아 근데 이거 reduce 초기값이 0이라 빈배열일때 0이 출력되네 당연한 소리긴한데
// 그러면 메소드 사용을 두개에서 하나로 줄일 수 있다는 거임
// 결과적으로는 짧아지는 거네