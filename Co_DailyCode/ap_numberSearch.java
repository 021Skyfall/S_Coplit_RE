package Co_DailyCode;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ap_numberSearch {
    public static void main(String[] args) {
        System.out.println(numberSearch("Hello6 9World 2, Nic8e D7ay!"));
    }
    private static int numberSearch(String str) {
        // 1. 정규표현식으로 int 추출
        String intStr = str.replaceAll("[^0-9]","");
        // 기존 문자열 공백 제거
        str = str.replaceAll(" ","");
        // 기존 문자열 숫자 제거
        str = str.replaceAll("[0-9]","");
        // 연산 시작
        double x = 0;
        for (int i = 0; i < intStr.length(); i++) {
            x += (intStr.charAt(i)-'0');
            // 여기서 -'0'을 넣는 이유는
            // charAt(i) 가 인트형으로 값을 리턴하게 되면 해당 문자의 아스키코드 값이 리턴됨
            // 즉 charAt(i) 가 '1'이라면 인트형인 x와 더 하게되면 49가 더해지는 것
            // 그래서 아스키코드가 48인 '0' 과 빼주는 것
            // 즉, charAt 메서드를 인트형으로 나타내면 아스키코드가 리턴됨
        }
        return (int) Math.round(x / str.length());

        // 2. for 문으로 int 추출
//        String intStr = "";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            // 1~9 아스키코드로 치환하면 48~57 임
//            // 즉, 아래의 조건문은 문자열에서 숫자가 걸리면 넣어줘라는 뜻
//            if (48 <= ch && ch <= 57) {
//                intStr += ch;
//                str = str.replace(String.valueOf(ch),"");
//            }
//        }
//        str = str.replaceAll(" ","");
//        double x = 0;
//        for (int i = 0; i < intStr.length(); i++) {
//            x += (intStr.charAt(i) -'0');
//        }
//        return (int) Math.round(x / str.length());
        // 시간 복잡도는 1이 나음

        // 3. 스트림으로 int 추출
        // str 문자를 스트림으로
//        IntStream stream = str.chars();
//        String intStr = stream.filter((ch) -> (48 <= ch && ch <= 57))
//                .mapToObj(ch -> (char)ch)
//                .map(Objects::toString)
//                .collect(Collectors.joining());
//        str = str.replaceAll(" ","");
//        str = str.replaceAll("[0-9]","");
//        IntStream intStream = intStr.chars();
//        return (int) Math.round((double) intStream.map(x -> x - '0').sum()/ str.length());
    }
}
// 참고
// https://codechacha.com/ko/java-extract-integers-from-string/ -> 문자열에서 숫자 추출
// https://cokes.tistory.com/80 -> -'0' 의 이유