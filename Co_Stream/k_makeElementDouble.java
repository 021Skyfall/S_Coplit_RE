package Co_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class k_makeElementDouble {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(makeElementDouble(list));
    }
    public static List<Integer> makeElementDouble(List<Integer> list) {
        return list.stream().map(e -> e*2).collect(Collectors.toList());
    }
}
// 요소 마다 뭔가를 해줘야하면 .map() 쓰면 됨