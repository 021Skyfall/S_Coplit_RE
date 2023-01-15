package Co_Stream;

import java.util.ArrayList;
import java.util.List;

public class b_computeAverageOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(computeAverageOfNumbers(list));
    }
    public static double computeAverageOfNumbers(List<Integer> list) {
//        return list.stream().mapToDouble(e -> e).average().getAsDouble();
        // 이건 더블로 변경 후 평균 내고 옵셔널더블인 값을 double 타입으로 받는거고
        return list.stream().mapToDouble(e -> e).average().orElse(0.0);
        // 얘는 다 똑같은데 orElse 로 자동 옵셔널 땐 타입으로 형변환하고
        // 엣지 케이스 넣은거
    }
}
