package Co_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class m_findPeople {
    public static void main(String[] args) {
        List<String> male = Arrays.asList("김코딩", "최자바", "김코츠");
        List<String> female = Arrays.asList("박해커", "김유클", "김코딩");
        System.out.println(findPeople(male,female,"김"));
    }
    public static List<String> findPeople(List<String> male, List<String> female, String lastName) {
        return Stream.concat(male.stream(),female.stream())
                .distinct()
                .filter(e -> e.startsWith(lastName))
                .sorted()
                .collect(Collectors.toList());
    }
}
// 리스트 두개 합쳐서
// 중복 제거 하고
// 매개변수 lastname 으로 시작하는거 필터링해준담에
// 정렬하고
// 리스트로 리턴
// 쉬운데 당시에는 왤캐 복잡하게 해쓸까