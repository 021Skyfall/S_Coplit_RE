package Co_Stream;

import java.util.ArrayList;
import java.util.List;

public class a_computeSumOfAllElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(computeSumOfAllElements(list));
    }
    public static int computeSumOfAllElements(List<Integer> list) {
        // 기존 풀이법
//        if (list.isEmpty()) return 0;
//        int x = 0;
//        for (int e : list) {
//            x+=e;
//        }
//        return x;

//        return list.stream().mapToInt(Integer::intValue).sum();
        return list.stream().reduce(0, (a, b) -> a + b);
        // ~> 메소드 참조 reduce(0,Integer::sum);
    }
}
// 위는 int IntStream 으로 바꿔서 sum() 쓴거고
// 아래는 reduce 요소 하나씩 뽑아서 이전의 것과 합계