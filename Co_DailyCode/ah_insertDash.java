package Co_DailyCode;

public class ah_insertDash {
    public static void main(String[] args) {
        System.out.println(insertDash("454793"));
    }
    public static String insertDash(String str) {
        if (str.isEmpty()) return null;
        // "연속된"
        // 결과를 담을 변수에 맨 str 첫번째 자리는 넣어야함 "연속된"
        String result = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            // 그다음부터 순회해서
            // 이전과 다음 수가 "연속된" 홀수 인지 판별
            if (str.charAt(i-1) % 2 == 1 && str.charAt(i) % 2 == 1) {
                // 맞다면 i 인덱스에 - 더함
                result += '-';
            }
            // 그 다음 요소 다시 합침
            result += str.charAt(i);
        }
        return result;
    }
}
// 여기서 놀라운 점
// 문자열을 char 타입으로 하나씩 가져오면
// 산술연산자 사용가능 ㄷㄷㄷㄷ