package Co_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class u_getElementOfListEntry {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        map.put("apple", Arrays.asList("apple", "red"));
        map.put("banana", Arrays.asList("delicious"));
        System.out.println(getElementOfListEntry(map,"apple",1));
    }
    public static String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        if (!hashMap.containsKey(key) || index > hashMap.size()) return null;
        List<String> x = hashMap.get(key);
        return x.get(index);
    }
}
// 일단 엣지 케이스 처리
// 인자인 key 로 입력된 hashMap 의 value 요소 가져옴
// 그걸 x 라는 List 타입에 담음
// 그럼 List 타입인 x 는 List 클래스의 메소드 사용 가능
// List 클래스의 get 메소드로 해당 인덱스 값 가져옴
// 끝