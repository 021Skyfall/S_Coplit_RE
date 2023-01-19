package Co_StackNQueue;

import java.util.ArrayList;
import java.util.Stack;

public class a_Browser {
    public static void main(String[] args) {
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        System.out.println(browserStack(actions,start));
    }
    public static ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        current.push(start);

        for (String s : actions) {
            // -1 이 걸린 경우 && 이전 스택이 비어있지 않은 경우
            if (s.equals("-1") && !prevStack.empty()) {
                nextStack.push(current.pop());
                current.push(prevStack.pop());
            }
            // 1이 걸린 경우 && 다음 스택이 비어있지 않은 경우
            else if (s.equals("1") && !nextStack.empty()) {
                prevStack.push(current.pop());
                current.push(nextStack.pop());
            }
            // 위에서 -1 혹은 1 인데 스택이 비어있는 경우
            else if (s.equals("1") || s.equals("-1")) {}
            // 알파뱃이 걸린 경우
            else {
                prevStack.push(current.pop());
                current.push(s);
                nextStack.clear();
            }
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);
        return result;
    }
}
