package Co_StackNQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b_RE {
    public static void main(String[] args) {
        Integer[] boxes = new Integer[]{1,5,7,9};
        System.out.println(paveBox(boxes));
    }
    public static int paveBox(Integer[] boxes) {
        ArrayList<Integer> result = new ArrayList<>();
        List<Integer> arr = new ArrayList<>(Arrays.asList(boxes));

        // 배열이 전부 빌 때까지 while
        while (!arr.isEmpty()) {
            // 배열 요소 순회 for
            for (int i = 0; i < arr.size(); i++) {
                // 0 번째 인덱스를 기준으로 잡고 계속해서 다음 요소랑 비교
                if (arr.get(0) < arr.get(i)) {
                    // 0 < i 일 때 result 에 해당 인덱스 저장 ~> 횟수
                    result.add(i);
                    // 0~i 까지 빼고 arr 초기화
                    arr = arr.subList(i, arr.size());
                    break;
                }
                // 끝까지 순회했지만 없다면 i 가 arr 마지막 요소의 인덱스와 같을 것
                if (i == arr.size() - 1) {
                    // arr.clear() 후 while 탈출
                    result.add(arr.size());
                    arr.clear();
                }
            }
        }
        // result 의 요소 중 가장 큰 값 리턴
        return result.stream().reduce(Integer::max).orElse(0);
    }
}
