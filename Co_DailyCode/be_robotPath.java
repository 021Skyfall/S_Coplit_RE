package Co_DailyCode;

public class be_robotPath {
    public static void main(String[] args) {
        int[][] x = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0}};

        int[] y = new int[]{4,2};
        int[] z = new int[]{2,2};

        System.out.println(robotPath(x,y,z));
    }
    private static int robotPath(int[][] room, int[] src, int[] dst) {
        // 현재 위치를 1로 초기화 -> 옆은 2
        // 중복 X
        // 마지막 계산 후 -1
        room = aux(room.length, room[0].length, src, 1, room);

        return room[dst[0]][dst[1]] - 1;
    }

    private static int[][] aux(int x, int y, int[] can, int step, int[][] room) {
        // 현재 위치 지정
        int row = can[0];
        int col = can[1];

        // 엣지케이스(배열의 범위)
        if (row < 0 || row >= x || col < 0 || col >= y) return room;

        if (room[row][col] == 0 || room[row][col] > step) {
            room[row][col] = step;
        } else { // 1이거나 1이하의 시간으로 통과 가능한 경우
            return room;
        }

        // dfs 4방향 탐색
        // 각각 인덱스로 표현
        aux(x, y, new int[]{row + 1, col}, step + 1, room); // 상
        aux(x, y, new int[]{row - 1, col}, step + 1, room); // 하
        aux(x, y, new int[]{row, col + 1}, step + 1, room); // 좌
        aux(x, y, new int[]{row, col - 1}, step + 1, room); // 우

        return room;
    }
}
// bfs 탐색 방식이 길을 찾으면 바로 멈추기 때문에
// 비슷하지만 좀 더 효율적이라함
