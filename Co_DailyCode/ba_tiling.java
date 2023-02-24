package Co_DailyCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ba_tiling {
    public static void main(String[] args) {
        System.out.println(tiling(30));
    }

//    private static int tiling(int num) {
//        if (num <= 2) return num;
//        return tiling(num - 1) + tiling(num - 2);
        // 기본적으로 이 타일링 문제는
        // 가진 타일과 바탕 타일이 세로 길이 2 로 같기 때문에
        // 사실상 피보나치 수열임
        // 근데 시간복잡도를 따짐 -> 그럼 이 피보나치 재귀는 소요 시간이 너무 긺
//    }

    // O(N)
    private static int tiling(int num) {
        // 인덱스 관리를 위해 더미로 채움
        ArrayList<Integer> memo = new ArrayList<>(Arrays.asList(0,1,2));
        return aux(num,memo);
    }
    private static int aux(int size, ArrayList<Integer> memo) {
        // 해결된 문제는 넘어감
        if (memo.size() > size) return memo.get(size);

        // 피보나치 수열과 비슷한 로직인데
        // 각각 계산된 리스트를 갖고 경우의 수를 구하기 위함
        memo.add(aux(size-1,memo) + aux(size-2,memo));
        return memo.get(size);
    }
}
