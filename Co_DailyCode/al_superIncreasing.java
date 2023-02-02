package Co_DailyCode;

public class al_superIncreasing {
    public static void main(String[] args) {
        System.out.println(superIncreasing(new int[]{1, 3, 6, 13}));
    }
    private static boolean superIncreasing(int[] arr) {
        // 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴
        // 중간에 하나라도 false 라면 false 리턴
        // 반복문으로 돌려서 i 가 0 ~ i-1 까지의 합보다 큰지 확인 반복해야함


        // 처음부터 i-1 까지의 합을 받아낼 변수 선언
        // 변수는 arr의 맨 처음 인덱스 요소
        int sum = arr[0];

        // 길이는 매개변수 배열 길이만큼
        // i-1 을 계속 더해주고 i와 비교해야 하기 때문에
        // 초기 i 의 값을 1로 두어야함
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= sum) return false;
            // i 인덱스 요소까지가 sum 보다 작거나 같으면 false 리턴해야함
            // 다시 보니까 합보다 "큰지" 임
            // 맨 처음에 했던 if 로직이 맞는 거고
            // if 에서 안걸러지면 해당 요소 더해주는 방식으로 접근
            sum += arr[i];
        }
        // 안의 조건이 걸리면 바로 값이 return 되기 때문에
        // 반복문이 끝까지 돌아가게끔 바깥에 return true 를 빼주고
        // 안쪽에 false 가 들어있어야함
        return true;
    }
}
