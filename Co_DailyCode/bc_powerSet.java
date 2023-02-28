package Co_DailyCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class bc_powerSet {
    public static void main(String[] args) {
        System.out.println(powerSet("abc"));
    }
    private static ArrayList<String> powerSet(String str) {
        String dedup = dedup(str);
        Stack<String> stack = new Stack<>();

        ArrayList<String> result = new ArrayList<>();

        result = pickOrNot(stack,0,dedup,result);

        // 오름차순 정렬
        Collections.sort(result);
        return result;
    }

    // 중복 제거 메서드
    private static String dedup(String str) {
        String result = "";

        // indexOf 메서드를 사용, 중복여부 확인
        for (int index = 0; index < str.length(); index++) {
            if (str.indexOf(str.charAt(index)) == index) {
                result += str.charAt(index);
            }
        }

        // 정렬 후 중복 제거된 결과 재결합
        String[] sorted = result.split("");
        Arrays.sort(sorted);
        result = String.join(",", sorted).replaceAll(",","");
        return result;
    }

    // 조합을 검사하기 위한 재귀 함수
    private static ArrayList<String> pickOrNot(Stack<String> stack, int idx, String subset, ArrayList<String> result) {
        // base case
        if (idx >= subset.length()) {
            // idx와 subset 길이 비교 후 스택을 문자열로 변환 후 잘라서 result에 삽입
            result.add(stack.toString()
                    .replaceAll("\\[","")
                    .replaceAll("]","")
                    .replaceAll(",","")
                    .replaceAll(" ",""));
            return result;
        } else {
            // idx 가 부분집합에 포함된 경우
            stack.push(Character.toString(subset.charAt(idx)));
            pickOrNot(stack,idx+1,subset,result);

            // idx 가 부분집합에 포함되지 않은 경우
            stack.pop();
            pickOrNot(stack, idx+1, subset, result);
        }
        return result;
    }
}
