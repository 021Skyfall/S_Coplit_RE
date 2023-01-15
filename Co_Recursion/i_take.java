package Co_Recursion;

import java.util.Arrays;

public class i_take {
    public static void main(String[] args) {
        int[] x = new int[]{1, -2, 1, 3};
        System.out.println(Arrays.toString(take(2,x)));
    }
    public static int[] take(int num, int[] arr) {
        if (arr.length == 0) return new int[]{};
        if (num >= arr.length) return arr;
        int[] tail = Arrays.copyOfRange(arr,0,arr.length-1);
        return take(num,tail);
    }
}
// 이거는 뒤에서 부터 출력하면되는데
// 베이스 케이스를 조심해야함
// 일단 엣지 케이스로 배열이 비었을때 빈배열
// num 이 크거나 같으면 바로 arr 리턴
// 조건에 맞지 않으면 재귀 호출 돌아가야됨
// 일단 뒤를 빼야되니까
// 뒤부터 하나씩 버리면서 재귀 ㄱ
// 그렇게 계속 빼다가 배열 길이가 num 과 같아지면? 해당 배열 리턴하는 것