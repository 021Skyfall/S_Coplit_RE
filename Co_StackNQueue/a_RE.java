package Co_StackNQueue;

import java.util.ArrayList;
import java.util.Stack;

public class a_RE {
    public static void main(String[] args) {
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        System.out.println(browserStack(actions,start));
    }
    private static ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        current.push(start);

        for (String str : actions) {
            // -1이 걸린 경우 && 이전 스택이 비어있지 않아야함
            if (str.equals("-1") && prevStack.size() != 0) {
                nextStack.push(current.pop());
                current.push(prevStack.pop());
            }
            // 1이 걸린 경우 && 다음 스택이 비어있지 않아야함
            else if (str.equals("1") && nextStack.size() != 0) {
                prevStack.push(current.pop());
                current.push(nextStack.pop());
            }
            // -1,1이 걸렸지만 스택이 비어있는 경우
            else if (str.equals("1") || str.equals("-1")) {}
            // 알파뱃이 걸린 경우
            else {
                prevStack.push(current.pop());
                current.push(str);
                nextStack.clear();
            }
        }
        result.add(prevStack);
        result.add(current);
        result.add(nextStack);
        return result;
    }
}
