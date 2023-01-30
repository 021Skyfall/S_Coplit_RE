package Co_DailyCode;

import java.util.Arrays;

public class ai_removeExtremes {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeExtremes(new String[]{"a", "b", "c", "def"})));
    }
    private static String[] removeExtremes(String[] arr) {
        // 엣지 케이스
        if (arr.length == 0) return null;

        // 결과 담을 배열
        // 단, 길이는 요소가 무조건 2개 빠지기 때문에 인자 길이 -2
        String[] result = new String[arr.length-2];

        // 가장 짧은 경우 비교 후 저장
        // 초기 값이 20인 이유는?
        // 뒤에서 부터 걸러주려고
        int shorten = 20;
        // 가장 긴 경우 비교 후 저장
        int longest = 0;

        //작은 요소 인덱스
        int sIdx = 0;
        // 긴 요소 인덱스
        int lIdx = 0;

        // 요소 하나씩 비교할 반복문
        for (int i = 0; i < arr.length; i++) {
            // 짧은 경우의 수
            if (arr[i].length() <= shorten) {
                shorten = arr[i].length();
                sIdx = i;
            }
            // 긴 경우의 수
            if (arr[i].length() >= longest) {
                longest = arr[i].length();
                lIdx = i;
            }
        }

        // 결과 배열에 다시 주워 담기
        // 단, arr 을 전체 순회하면서 가장 긴 문자열 인덱스와 가장 짧은 문자열 인덱스는 제외하고 순서대로 삽입
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != lIdx && i != sIdx) {
                result[cur] = arr[i];
                cur++;
            }
        }
        return result;
    }
}
