package Co_Stream;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class f_makeUniqueNameArray {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김코딩", "박해커", "김코딩", "최자바", "박해커");
        System.out.println(Arrays.toString(makeUniqueNameArray(names)));
    }
    public static String[] makeUniqueNameArray(List<String> names)  {
        return names.stream().distinct().sorted().toArray(String[]::new);

    }
}
// 중복제거 distinct() , 정렬 sorted()
// 스트림 클래스의 toArray 메소드는 스트림의 요소를 새 어레이에 누적하는 메소드
//toArray 의 리턴 타입은 Object[] 임
// 그래서 String[] 타입으로 강제 형변환이 불가능함
// .toArray(e -> new String[e]) 이런식으로 list 의 요소를 새로 만들 배열의 요소로 집어넣어야함
// 이걸 람다식 메소드 참조 한게 toArray(String[]::new) 임
// 근데 이건 새로운 배열의 주소값을 리턴하기 때문에
// Arrays 클래스의 toString 메소드로 문자열로 출력해줘야함