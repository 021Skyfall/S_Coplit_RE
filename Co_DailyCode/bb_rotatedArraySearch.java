package Co_DailyCode;

public class bb_rotatedArraySearch {
    public static void main(String[] args) {
        System.out.println(rotatedArraySearch(new int[]{4, 5, 6, 0, 1, 2, 3}, 2));
    }

    private static int rotatedArraySearch(int[] rotated, int target) {
        // O(N)
//        for (int i = 0; i < rotated.length; i++) {
//            int x = rotated[i];
//            if (x == target) return i;
//        }
//        return -1;

        // O(logN)
        // 절반이 정렬되어있는지 확인 후 타겟에 비교해 잘라서 계산 -> 이진 탐색 변형
        int left = 0;
        int right = rotated.length - 1;

        while (left <= right) {
            int middle = (right + left) / 2;

            if (rotated[middle] == target) {
                return middle;
            }

            if (rotated[left] < rotated[middle]) {
                if (target < rotated[middle] && rotated[left] <= target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (target <= rotated[right] && rotated[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }
}
