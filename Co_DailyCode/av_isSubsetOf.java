package Co_DailyCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class av_isSubsetOf {
    public static void main(String[] args) {
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        System.out.println(isSubsetOf(base,sample));
    }
//    private static boolean isSubsetOf(int[] base, int[] sample) {
//        // (시간 복잡도 O(N^2))
//        // 비교하기 편하게 둘 다 정렬
//        base = Arrays.stream(base).sorted().toArray();
//        sample = Arrays.stream(sample).sorted().toArray();
//        // count 하나 선언해서 비교 후 true 일시 카운트 업하고
//        // 반복문을 빠져나왔을 때 count 가 sample 이랑 같아지면 true 리턴 아니면 암것도 안함
//        int count = 0;
//        // base 길이 만큼 반복하고 내부 반복으로 sample 요소 하나씩 뽑아서 base 요소 순서대로 비교
//        for (int i = 0; i < base.length; i++) {
//            for (int j = 0; j < sample.length; j++) {
//                if (base[i] == sample[j]) count++;
//            }
//        }
//        // 포함 여부
//        if (count == sample.length) return true;
//        // 기본 false
//        return false;
//    }

    // 컬렌션과 반복문 하나로 돌리는 리퍼런스 코드 (시간 복잡도 O(N+M))
    // List 의 contains 함수 사용
    private static boolean isSubsetOf(int[] base, int[] sample) {
        List<Integer> list = Arrays.stream(base).boxed().collect(Collectors.toList());
        for (int i : sample) {
            if (list.contains(i)) return true;
        }
        return false;
    }
}

