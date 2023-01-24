package Co_DailyCode;

public class ac_firstReverse {
    public static void main(String[] args) {
        ac_firstReverse c = new ac_firstReverse();
        System.out.println(c.firstReverse("code states"));
    }
    public String firstReverse(String str) {
        StringBuilder x = new StringBuilder(str);
        return x.reverse().toString();
    }
}
// StringBuilder 클래스의 .reverse() 메소드는 문자열을 뒤집음