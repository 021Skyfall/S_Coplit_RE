package Co_DailyCode;

import java.util.Arrays;

public class aj_reverseArr {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArr(new int[]{1, 2, 3})));
    }
    private static int[] reverseArr(int[] arr){
        // 재귀로 배열 뒤집기

        // base case
        // 마지막에 빈배열로 주워담아야함
        if (arr.length == 0) return new int[]{};
        // 헤드 만들어서 가장 마지막 요소 빼먹
        int[] head = Arrays.copyOfRange(arr,arr.length-1,arr.length);
        // 테일 만들어서 나머지 요소 재귀
        int[] tail = reverseArr(Arrays.copyOfRange(arr,0,arr.length-1));

        // 결과 담아줄 배열 생성하고 크기는 매개변수 배열 만큼
        int[] result = new int[arr.length];
        // System.arraycopy 로 빼먹은거 복사해서 넣어
        // 헤드는 0번 인덱스만 넣어주면되고
        // 테일은 헤드 길이 이후부터 자기 길이까지 잘라서 넣어주고
        System.arraycopy(head,0,result,0,head.length);
        System.arraycopy(tail,0,result,head.length,tail.length);

        return result;
    }
}
