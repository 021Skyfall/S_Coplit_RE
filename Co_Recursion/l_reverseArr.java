package Co_Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class l_reverseArr {
    public static void main(String[] args) {
        int[] x = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(reverseArr(x)));
    }
    public static int[] reverseArr(int[] arr) {
        if (arr.length == 0) return new int[]{};
        int[]head = Arrays.copyOfRange(arr,arr.length-1,arr.length);
        int[]tail = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));

        int[] result = new int[arr.length];
        System.arraycopy(head,0,result,0,head.length);
        System.arraycopy(tail,0,result,head.length,tail.length);

        return result;
    }
}
// 이거 진짜 처음봤을때 어떻게 정의해야되지라는 생각밖에 안들었음 진짜로
// 일단 가장 먼저 맨 뒤를 떼어 가고 재귀가 끝나고 나올 때마다
// 그 때 간걸 다시 더해줘야함
// 보통은 앞을 떼어가고 저장해서 더해줬는데
// 얘는 반대임
// 왜?
// 뒤집어 줘야된다는 소리 자체가
// 마지막으로 출력되는 배열의 맨뒤 요소부터 순차적으로 할당돼야하거든
// 그다음 빠져나오면서 새로운 배열 선언해서 거기에 넣어주면서 돌아가면
// 거꾸로 복사되는 거와 같은 현상
// System 클래스의 arraycopy(원본,어디부터복사할지,복사본,복사본어디부터넣을지,원본에서복사될길이)
//System.arraycopy(head,0,result,0,head.length);
// 헤드를 복사해봄, 헤드의 0부터 복사할거임, 복사위치는 result, result 의 0부터 복사함, head 의 길이만큼
//System.arraycopy(tail,0,result,head.length,tail.length);
// 테일을 복사함, 테일의 0부터, result 로, 헤드 길이의 뒤부터, 테일 전체 복사할것
// 팁 : 배열 선언 했을 때 크기를 지정해주면 인트 타입의 배열은 초기값이 {0,0,0} 이런식임