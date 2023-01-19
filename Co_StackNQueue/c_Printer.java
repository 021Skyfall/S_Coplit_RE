package Co_StackNQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class c_Printer {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};
        System.out.println(queuePrinter(bufferSize,capacities,documents));
    }
    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // 초 단위를 담을 변수 선언 초기화
        int second = 0;
        // 큐를 만들고 bufferSize 만큼 공간 형성
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < bufferSize; i++) {
            q.add(0);
        }
        // 첫 1초 작업
        q.poll();
        q.add(documents[0]);
        documents = Arrays.copyOfRange(documents,1,documents.length);
        second++;

        // 큐의 요소가 전부 0 혹은 배열이 비어야 끝나도록해야함
        while (q.stream().mapToInt(Integer::intValue).sum() != 0 || documents.length != 0 ) {
            // 배열에 문서가 남은 경우
            if (documents.length != 0) {
                // 작업중인 문서와 들어올 문서의 합이 용량보다 큰 경우
                if (q.stream().mapToInt(Integer::intValue).sum() + documents[0] > capacities) {
                    q.poll();
                    // 문서가 제거되고, 배열의 다음 요소가 들어왔을 때 수용 가능하면
                    if (q.stream().mapToInt(Integer::intValue).sum() + documents[0] <= capacities) {
                        q.add(documents[0]);
                        documents = Arrays.copyOfRange(documents,1,documents.length);
                        second++;
                    }
                    else { // 문서가 제거되고, 배열의 다음 요소가 들어왔을 때 수용 불가능하면
                        q.add(0);
                        second++;
                    }

                }
                else { // 작업중인 문서와 들어올 문서의 합이 용량보다 작은 경우
                    q.poll();
                    q.add(documents[0]);
                    documents = Arrays.copyOfRange(documents,1,documents.length);
                    second++;
                }
            }
            // 배열에 문서가 없는 경우
            else {
                q.poll();
                q.add(0);
                second++;
            }
        }
        return second;
    }
}
