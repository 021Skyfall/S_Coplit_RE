package Co_DailyCode;

public class a_powerOfTwo {
    public static void main(String[] args) {
        a_powerOfTwo asd = new a_powerOfTwo();
        System.out.println(asd.powerOfTwo(24454353453452342l));
    }
    public boolean powerOfTwo(long num) {
        if (num == 1) return true;
        long x = 2;
        while (x < num) {
            x *= 2;
        }
        return x == num;
    }
}
// 엣지 케이스로 1이 들어오면 2의 0승이니 true 리턴
// 결국 2의 제곱은 2를 계속 해서 곱해서 나오는 값임
// 그럼 2를 또 다른 변수에 초기화 값으로 할당하고
// 해당 2를 반복문으로 계속 곱함
// 계속 곱하다가 num 과 같거나 num 보다 커지면 탈출
// 해당 탈출된 x 의 값이 num 과 같으면 2의 제곱일 것이고
// num 과 다른 숫자면 2의 제곱이 아닐것임
// 앞에서 말했듯이 결국 2의 제곱은 2를 계속 곱한 것이기 때문에