package Co_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j_arrayToArrayList {
    public static void main(String[] args) {
        String[] arr = new String[] {"코","드","조","아"};
        System.out.println(arrayToArrayList(arr));
    }
    public static List<String> arrayToArrayList(String[] arr) {
        return arr.length == 0 ?
//                null : new ArrayList<>(List.of(arr));
        null : new ArrayList<>(Arrays.asList(arr));
    }
}
/* List.of() vs Arrays.asList()
* 가장 큰 차이점은 List.of() 는 리스트 형태로 변형된 배열의 값을 변경할 수 없음
* Arrays 클래스의 asList 메소드는 수정이 가능함
* 이는 List.of() 메소드의 리턴 값이 ListN 이라는 타입의 객체를 반환하고
* 이 타입은 Immutable object 즉, 불변 객체임
* 단 Arrays.asList() 가 반환하는 ArrayList 타입의 배열은
* 따지면 ArrayList 클래스가 아니라 Arrays 클래스의 내부 클래스에서 리턴되는 것이라
* 수정 시에 add() remove() 를 쓸 수 없고 보통 set()을 사용함
* 이는 배열이 크기나 길이를 변경할 수 없는 특성이 있기 때문임
* 또한 List.of()는 null 값을 허용하지 않음
* 마지막으로 List.of()는 작고 불변하는 데이터의 경우
* Arrays.asList() 는 크고 동적인 데이터의 경우 사용
* # 만약 크기를 바꾸려면 Collections 를 생성해서 요소의 값을 옮겨야함
*/
