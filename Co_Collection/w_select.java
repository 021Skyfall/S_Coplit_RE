package Co_Collection;

import java.util.HashMap;

public class w_select {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            String[] x = new String[]{"a","c"};
            hashMap.put("a", 1);
            hashMap.put("b", 2);
            hashMap.put("c", 3);
        System.out.println(select(x,hashMap));
    }
    public static HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        HashMap<String, Integer> x = new HashMap<>();
        for (String e : arr) {
            if (hashMap.containsKey(e)) {
                x.put(e,hashMap.get(e));
            }
        }
        return x;
    }
}
// 문제가 해쉬맵의 키 값과 배열의 요소가 일치하면
// 해당 배열의 요소를 키로 해쉬맵의 value 를 value 로 해서
// 새로운 해쉬맵 생성하라는 말임
// 그럼 for-each 로 배열 순회 하면서
// if 넣고 해당 배열의 요소 하나하나가
// 인자로 입력된 해쉬맵의 키와 같은지 확인 ~> containsKey()
// 같다면 새로운 해쉬맵의 키로 해당 배열, 값으로 인자 입력된 해쉬맵의 값을
// 넣어서 리턴하면 됨