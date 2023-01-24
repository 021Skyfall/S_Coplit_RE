package Co_DailyCode;

import java.util.*;

public class ae_convertListToObject {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };
        System.out.println(convertListToHashMap(arr));
    }
    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // 담아줄 해쉬맵
        HashMap<String, String> map = new LinkedHashMap<>();
        // 아 빈배열 엣지 케이스를 못봤다
        if (arr.length == 0) return map;
        // for 돌려서 [0], [1], [2] ... 의 바깥 배열 인덱스 중
        // 다시 for 돌려서 각 바깥 배열 인덱스의 안쪽 인덱스를 순회
        // 안쪽 배열 인덱스 0을 키로, 1을 값으로
        for (int i = 0; i < arr.length; i++) {
            // 저 위에 엣지케이스 주가했으니 괜찮겠지 했는데
            // 계속 IndexOutOfBoundsException 떠서 다시 봤는데
            // 테스트에 안쪽 배열이 빈 경우가 걸림
            // 그래서 안쪽 배열이 비었을 때도 설정해줘야함
            // 이차원 배열이라 그러네 난 왜 해줬는데 자꾸 예외 나오지 했네
            if (arr[i].length != 0) {
                // 해당 키를 갖고 있지 않다면 LinkedHashMap 이니 순서대로 넣어줄 것임
                if (!map.containsKey(arr[i][0])) map.put(arr[i][0], arr[i][1]);
            }
        }
        return map;
    }
}
