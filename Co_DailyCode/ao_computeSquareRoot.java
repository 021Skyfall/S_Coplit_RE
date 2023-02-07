package Co_DailyCode;

public class ao_computeSquareRoot {
    public static void main(String[] args) {
        System.out.println(computeSquareRoot(9));
    }
    private static String computeSquareRoot(int num) {
        // 임의의 양의 실수 -> 이 값이 제곱근을 구하고자하는 숫자에 가까울수록 정밀하게 찾을 수 있음
        double x = num;
        // 임의의 수 만큼 반복
        for (int i = 0; i < x; i++) {
            // 바빌로니아 법 ( = 헤론법)
            x = 0.5 * (x + (num/x));
            // 직접 계산해보니
            // 연산이 돌아갈수록 구하고자하는 숫자에 가까워짐
            // 계속해서 소수점 자리를 줄여 나가면서 구하고자하는 값에 근사해짐
            // 그리고 지금은 9번이 돌아게끔 되어있는데
            // 보니까 중간에 원하는 값이 구해지긴함 근데 나머지 횟수가 계속 돌아가도 같은 값임
            // 다만, 지금 제곱근이 자연수로 떨어지는 값을 넣었고 소수 2째 자리 까지만 출력하게 해놔서 그럼
        }
        // 문자열로 변환
        return String.format("%.2f",x);
    }
}
// 참고
// https://jihogrammer.tistory.com/16
// 기본 식
// Xn+1 = 1/2(Xn+num/Xn)
// 기준이 되는 숫자 = 구하고자 하는 제곱근 초기값
// 기준 숫자 만큼 계속 반복해서 기준 숫자를 줄여나감