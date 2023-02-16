package Co_DailyCode;

import java.util.ArrayList;

public class au_fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }
    private static int fibonacci(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        return aux(list,num);
    }
    private static int aux(ArrayList<Integer> list, int num) {
        if (list.size() <= num) {
            list.add(aux(list,num-1) + aux(list,num-2));
        }
        return list.get(num);
    }
}
// 함수를 하나 더 구현하네
// 베이스 케이스로 무조건 포함된 0, 1 먼저 list 에 넣어주고
// 함수 하나 더 구현해서 list 가 num 사이즈가 될 때까지
// 피보나치 수열 쭉 구해주고
// 해당 로직이 num 사이즈에 도달하면 num 자리의 list 요소를 불러오는 풀이...
// 즉 전달인자로 받은 자리 수 까지 구하는게 끝나면 더 이상 나아가지 않으니 시간 복잡도도 낮아지고...
// 앞서 배열로 구현했던게 비슷한 경우 인거같은데
// 이게 더 직관적이고 깔끔하네
// 애초에 함수 하나 더 구현해야할까 아닐까 를 잘 모르겠다 -> 좀 더 유연하게 생각해봐야할듯
