package Co_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class c_filterOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(filterOddNumbers(list));
    }
    static List<Integer> filterOddNumbers(List<Integer> list) {
        return list.stream().filter(e -> e%2 == 0).collect(Collectors.toList());
    }
}
// 필터로 짝수 걸러주고, collect 로 다시 해당 리스트 반환