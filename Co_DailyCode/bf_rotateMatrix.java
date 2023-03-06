package Co_DailyCode;

import java.util.Arrays;

public class bf_rotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int K = 2;
        int[][] result = rotateMatrix(matrix, K);
        assert result != null;
        System.out.println(result[0][0]+"\n"+result[3][2]);
    }
    private static int[][] rotateMatrix(int[][] matrix, int K) {
//        // 빈 배열 엣지 케이스
//        if (matrix == null) return null;
//        // 전달받는 2차원 배열 matrix 가 K 만큼 시계 방향으로 90도 회전
//        int n = matrix.length; // raw
//        int m = matrix[0].length; // col
//        int[][] rotate = new int[m][n]; // 크기만큼 2차원 배열 생성
//        for (int r = 0; r < K; r++) { // 회전 횟수
//            for (int i = 0; i < rotate.length; i++) {
//                for (int j = 0; j < rotate[i].length; j++) {
//                    rotate[i][j] = matrix[n - 1 - j][i];
//                }
//            }
//            matrix = rotate;
//        }
//        return rotate;
        while (K > 0) {
            K--;
            matrix = rotate(matrix);
        }
        return matrix;
    }
    // 회전 로직 ~> 위 로직에 matrix 를 바꿔주면서 동작시켜도 통과가 안됨
    private static int[][] rotate(int[][] matrix) {
        // 빈 배열 엣지 케이스
        if (matrix == null) return null;
        // 전달받는 2차원 배열 matrix 가 K 만큼 시계 방향으로 90도 회전
        int n = matrix.length; // raw
        int m = matrix[0].length; // col
        int[][] rotate = new int[m][n]; // 크기만큼 2차원 배열 생성
        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate[i].length; j++) {
                rotate[i][j] = matrix[n - 1 - j][i];
            }
        }
        return rotate;
    }
}
