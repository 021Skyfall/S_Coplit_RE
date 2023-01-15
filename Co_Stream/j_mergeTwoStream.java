package Co_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class j_mergeTwoStream {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("김코딩", "박해커");
        List<String> list2 = Arrays.asList("최자바", "이스프링");
        System.out.println(mergeTwoStream(list1,list2));
    }
    public static List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        return Stream.concat(list1.stream(),list2.stream()).collect(Collectors.toList());
    }
}
// Stream 클래스의 concat 은 리스트 들의 요소를 "뽑아와서" 합쳐주는 메소드임
// 그래서 list1 과 2 도 stream 으로 순회시켜야함
// 이후 출력 값은 list 로 문제에서 제한 했기 때문에
// collect 로 list 리턴