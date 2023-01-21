package Co_StackNQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class c_RE {
    public static void main(String[] args) {
        int bufferSize = 2;
        int capacities = 10;
        int[] documents = new int[]{7, 4, 5, 6};
        System.out.println(queuePrinter(bufferSize,capacities,documents));
    }
    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        // 초 단위 담을 변수
        int second = 0;
        // 큐를 만든 후 buffersize 만큼 크기 지정 이후 0으로 채워넣기
        Queue<Integer> box = new LinkedList<>();
        for (int i = 0; i < bufferSize; i++){
            box.add(0);
        }
        // 첫 1초 작성
        box.poll();
        box.add(documents[0]);
        documents = Arrays.copyOfRange(documents,1,documents.length);
        second++;
        // 큐 객체의 합이 0이 아니거나 배열이 빌 때까지 반복
        while (box.stream().reduce(Integer::sum).orElse(0) != 0 || documents.length != 0 ) {
            // document 에 요소가 남은 경우
            if (documents.length != 0) {
                // 작업중인 문서와 남은 문서중 가장 처음 문서의 크기가 capacities 보다 큰 경우
                if (box.stream().reduce(Integer::sum).orElse(0) + + documents[0] > capacities) {
                    box.poll();
                    // 문서가 제거되고 남은 대기열의 첫번째 문서를 수용 가능할 때
                    if (box.stream().reduce(Integer::sum).orElse(0) + + documents[0] <= capacities) {
                        box.add(documents[0]);
                        documents = Arrays.copyOfRange(documents,1,documents.length);
                        second++;
                    }
                    // 문서가 제거되고 남은 대기열의 첫번째 문서를 수용 불가능 할때
                    else {
                        box.add(0);
                        second++;
                    }
                }
                // 작업중인 문서와 남은 문서중 가장 처음 문서의 크기가 capacities 보다 작은 경우
                else {
                   box.poll();
                   box.add(documents[0]);
                   documents = Arrays.copyOfRange(documents,1,documents.length);
                   second++;
                }
            }
            // documents 가 비었을 경우
            if (documents.length == 0) {
                box.poll();
                box.add(0);
                second++;
            }

        }
        return second;
    }
}
