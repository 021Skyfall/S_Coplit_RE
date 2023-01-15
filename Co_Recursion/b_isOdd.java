package Co_Recursion;

public class b_isOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(4));
    }
    public static boolean isOdd(int num) {
        if (num == 0) return true;
        if (num == 1) return false;
        if (num < 0) return isOdd(-num);
        return isOdd(num-2);
    }
}
// 탈출 조건으로 홀수냐 짝수냐하고
// % 랑 / 연산자는 못쓰니까 반복 빼기 해주면되고
// 리커젼 케이스 정의 할 때 해당 메소드를 돌려서 리턴된 값을 가져온다는 거 기억해야함