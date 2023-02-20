package Co_DailyCode;

public class aw_power {
    public static void main(String[] args) {
        System.out.println(power(3, 40));
    }
    private static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        long result = power(base,exponent/2);
        if (exponent % 2 == 0) {
            return (result * result) % 94906249;
        } else {
            return (result * result * base) % 94906249;
        }
    }
}
// 94906249
// 모듈로 거듭제곱법
// 시간복잡도 O(logN)