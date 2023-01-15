package Co_Recursion;

public class a_sumTo {
    public static void main(String[] args) {
        System.out.println(sumTo(4));
    }
    public static int sumTo(int num) {
        if (num == 0) return 0;
        return num += sumTo(num-1);
    }
}
// 재귀함수의 기본 =
// 1. 탈출 조건 (base case) 설정
// 2. 루프 타서 문제 쪼개기 ~> 재귀호출
// 이 문제는 4 가 들어오면 계속해서 0이 될때까지 4 3 2 1 이 인자로 들어가고 직전에 들어간
// 수와 합해서 리턴됨
// 어렵게 생각하지말고 그냥 메소드 또 돌린다고 생각하면됨