package Co_DailyCode;

import java.util.Stack;

public class az_balancedBrackets {
    public static void main(String[] args) {
        System.out.println(balancedBrackets("{{"));
    }
    private static boolean balancedBrackets(String str) {

        // 스택 활용
        Stack<String> box = new Stack<>();
        // for -> str 탐색
        for (int i = 0; i < str.length(); i++) {
            // 캐릭터 저장
            char start = str.charAt(i);
            // 시작 괄호면 push
            if (start == '(' || start == '[' || start == '{') {
                box.push(String.valueOf(start));
            } else {
                // 연산 중간에 스택이 비어버리면 시작 괄호가 없는 것임
                if (box.size() == 0) return false;
                // 종료 괄호라면 시작 괄호와 매칭되는지 확인 -> 매칭된다면 스택 pop
                else if (start == ')' && box.contains("(") ||
                start == '}' && box.contains("{") ||
                start == ']' && box.contains("["))
                    box.pop();
            }
        }
        // 스택 길이가 0이 된다면 전부 매칭
        // 스택의 길이가 != 0 이라면 남는게 있다는 뜻
        return box.size() == 0;
    }
}
