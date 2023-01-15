package Co_Recursion;

public class c_factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int factorial(int num) {
        if (num == 0) return 1;
        return num *= factorial(num-1);
    }
}
// a 의 덧셈과 마찬가지인데
// 곱셈이라 0을 곱하면 0이 결과라서
// 베이스 케이스로 1를 둬야 잘 곱해짐