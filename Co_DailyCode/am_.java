package Co_DailyCode;

public class am_ {
    public static void main(String[] args) {
        System.out.println(modulo(25, 4));
    }
    private static Integer modulo(int num1, int num2) {
//        if (num2 == 0) return null;
//        return Math.floorMod(num1,num2);
//         Mod 함수로 푼거

        if (num2 == 0) return null;
        while (num1 >= num2) {
            num1 = num1 - num2;
        }
        return num1;
        // for 이 아닌 while 로 마지막 num2 까지 계속 빼주고서
        // num1 리턴
        // 여기서 num1 이 0일 경우를 생각 안해도 되는 이유가
        // Math 클래스의 mod 함수를 써도 나머지 0으로 자동 계산되고
        // num2 보다 num1이 작기 때문에 while 문 돌지 않고 바로 num1 리턴됨
        // 여튼 num1 이 num2 보다 작아지면 while 문 탈출하게 되니까
        // 나머지 구하기가 됨
        // 이 간단한 알고리즘이 생각안나서 mod 함수로 풀다니..

    }
}
