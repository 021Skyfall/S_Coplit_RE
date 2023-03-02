package Co_DailyCode;

import java.util.Arrays;

public class bd_orderOfPresentation {
    public static void main(String[] args) {
        System.out.println(orderOfPresentation(3, new int[]{2, 3, 1}));
    }
    private static int orderOfPresentation(int N, int[] K) {
        // N개의 조가 있을 때 발표순서를 중복없는 경우의 수로 나타낸 뒤
        // K 라는 발표순서가 담긴 안쪽배열의 순서를 리턴하면 됨
        // 순열 문제
        // 근데 배열 K의 위치만 가져오면 되니까
        // 순열을 전부 완성할 필요는 없어보임
        // 중간에 K와 일치하는 값을 찾는다면 인덱스 리턴하게
        // 그럼 순서을 담아서 비교해야함

        // 발표 순서
        int order = 0;

        // 중복될 필요가 없으므로 DFS 방식으로 방문 여부 체크할 것임
        // 단, 조는 1부터 시작이기 때문에 방문 체크 배열은 4의 길이가 되어야함
        boolean[] visited = new boolean[N + 1];

        // K의 길이만큼 순회하고
        for (int i = 0; i < K.length; i++) {
            // K의 i 번째 요소를 변수에 할당함
            int num = K[i];
            // 중복이 아니니까 해당 자리는 방문 체크
            visited[num] = true;
            // k의 i 번째 요소보다 앞에 올 수 있는 배열을 복제
            boolean[] forward = Arrays.copyOfRange(visited,1,num);
            // 위에서 복제된 배열에서 아직 사용되지 않은 경우의 수의 개수를 구함
            int val = 0;
            for (boolean fw : forward) if (!fw) val++;
            // 아직 사용되지 않은 경우의 수를 카운트
            int former = val * factorial(N - i - 1);
            // 해당 카운트를 order에 더해줌
            order = order + former;
        }
        return order;
    }

    private static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n-1);
    }
}
/**
 * 설명을 덧붙이자면,
 * 만약 K가 [2, 3, 1]이라고 가정했을 때, 첫 번째 num은 2가 될 것입니다.
 * 2가 제일 앞에 있다고 가정한다면, 앞자리가 2의 차례가 오기 전에 1의 모든 경우의 수를 구했을 것이고,
 * 1의 모든 경우의 수를 지금부터 구하게 됩니다.
 *
 * 그렇다면, IsUsed 배열은 이렇게 됩니다. [false(더미), false, true, false]
 * candidates 배열은 이렇게 됩니다. => [false]
 * validCnt는 이렇게 됩니다. => 1
 * formerCnt는 이렇게 됩니다. => 1 * factorial(3 - 0 - 1) // i는 0부터 시작하기 때문에 N에서 남아 있는 수를 구할 때 - 1이 추가로 필요합니다.
 * order는 2를 추가합니다.
 *
 * 두 번째를 순회했을 땐, num이 3이 됩니다.
 * 그렇다면, IsUsed 배열은 이렇게 됩니다. [false(더미), false, true, true]
 * candidates 배열은 이렇게 됩니다. => [false]
 * validCnt는 이렇게 됩니다 => 1
 * formerCnt는 이렇게 됩니다 => 1 * factorial(3 - 1 - 1)
 * order는 1을 추가합니다. (3)
 *
 * 세 번째를 순회했을 땐, num이 1이 됩니다.
 * IsUsed 배열은 이렇게 됩니다. [false, true, true, true]
 * candidates 배열은 []이고, validCnt는 0이 되어, formerCnt는 0이 됩니다.
 *
 * 발표 순서는 0부터 시작하기 때문에 0, 1, 2, 3으로
 * 결과적으로, 값은 3이 됩니다.
 **/