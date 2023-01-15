package Co_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class g_filterName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "김자바");
        System.out.println(Arrays.toString(filterName(names)));
    }
    public static String[] filterName(List<String> names) {
        return names.stream().distinct().filter(e -> e.startsWith("김")).sorted()
                .toArray(String[]::new);
    }
}
// 이건 직전 문제랑 같긴한데 필터로 startsWith 메소드 즉, 특정한 문자로 시작하는지를
// boolean 으로 리턴하고 거기서 걸러진 값을 정렬해서 배열로 출력하는 문제임
