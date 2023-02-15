package Co_DailyCode;

import java.util.Arrays;
import java.util.Comparator;

public class as_largestProductOfThree {
    public static void main(String[] args) {
        System.out.println(largestProductOfThree(new int[]{2,1,3,7}));

    }
    private static int largestProductOfThree(int[] arr) {
//        int result;
//        int max;
//        int min;
//        // 내림차순 정렬 후 앞 3개 곱 -> 정렬하게되면 양수 중 가장 큰 값은 앞으로, 음수 중 가장 작은 값은 뒤로
//        Integer[] tmp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Arrays.sort(tmp, Comparator.reverseOrder());
//        // 우선 양수만 입력되었을 경우
//        max = tmp[0]*tmp[1]*tmp[2];
//        min = tmp[0]*tmp[tmp.length-1]*tmp[tmp.length-2];
//        // 가장 큰 양수 3개를 곱한 경우 vs 가장 작은 음수 2개와 가장 큰 양수 1개를 곱한 경우
//        // ? 조건이 3개의 곱이기 때문에 음수는 무조건 2개가 곱해져야 양수보다 커짐 3개는 안됨
//        // 등호는 방향이 어디건 상관이 없음
//        if (max < min) {
//            result = min;
//        } else {
//            result = max;
//        }
//        return result;

        //아 복잡하게 했는데 생각해보니까
        //그냥 올림차순하고 length 로 위치 잡아주면 되네 아 ㅋㅋ
        // 심지어 변수 3개도 필요없고 그냥 곱할때 초기화해줄 변수 갖고서
        // 막판에 그냥 Math 클래스 갖고 비교하면 돼서 if도 필요없네 아 ㅋㅋㅋㅋ
        Arrays.sort(arr);
        int product1 = arr[arr.length-1]*arr[arr.length-2]*arr[arr.length-3];
        int product2 = arr[0]*arr[1]*arr[arr.length-1];
        return Math.max(product1,product2);
        // 허망하구만
    }
}
