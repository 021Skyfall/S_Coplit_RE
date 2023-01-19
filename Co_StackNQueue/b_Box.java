package Co_StackNQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class b_Box {
    public static void main(String[] args) {
        Integer[] boxes = new Integer[]{5, 1, 4, 6};
        System.out.println(paveBox(boxes));
    }
    public static int paveBox(Integer[] boxes) {
        ArrayList<Integer> answer = new ArrayList<>();
        List<Integer> arr = new ArrayList<>(Arrays.asList(boxes));
        // 받아 온 인자가 비어버릴 떄까지 반복
        while (!arr.isEmpty()) {
            // 요소를 하나씩 순회
            for (int i = 0; i < arr.size(); i++){
                // 비교했을 때 처음 값보다 크다면 거기서 멈추고 answer 에 횟수 저장 후 해당 부분 만큼 arr 지우기
                if (arr.get(i) > arr.get(0)) {
                    // 반복되었던 횟수를 answer 에 저장
                    answer.add(i);
                    // 해당 자리의 인덱스부터 arr 끝까지 다시 초기화
                    arr = arr.subList(i,arr.size());
                    break; // 해당 자리를 뺀 다음 for 를 탈출 시켜서 초기화된 리스트 다시 순회
                }
                // 끝까지 순회했는데 위에 해당하는 경우가 없는 경우
                // ~> 끝까지 순회한 횟수인 i 와 arr 의 마지막 요소 인덱스 와 같은지 비교
                if (i == arr.size()-1) {
                    // 전체 횟수 출력해야하기 때문에 arr 길이 넣어주면 됨
                    answer.add(arr.size());
                    // 즉시 arr 싹 지워주고 while 까지 탈출
                    arr.clear();
                }
            }
        }
        return answer.stream().max(Integer::compare).orElse(0);
    }
}
