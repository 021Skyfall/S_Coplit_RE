package Co_DailyCode;

public class ag_ABCheck {
    public static void main(String[] args) {
        System.out.println(ABCheck("lane Borrowed"));
    }
    public static boolean ABCheck(String str) {
        // 대소 구분 없애기 위한 소문자로 변경
        str = str.toLowerCase();
        // a로 시작 b로 시작 혹은 반대인 문자열의 길이가 최소 5니까
        // i 를 4로 두고 str의 길이 만큼 반복하면서 ~> 4로 둔 이유는 인덱스가 0부터 시작이니까
        for (int i = 4; i < str.length(); i++) {
            // 5 length 의 간격으로 a 혹은 b 가 있거나 반대의 경우면 true 리턴
            if (str.charAt(i-4) == 'b' && str.charAt(i) == 'a' ||
                    str.charAt(i-4) == 'a' && str.charAt(i) == 'b')
                return true;
        }
        return false;
    }
}
