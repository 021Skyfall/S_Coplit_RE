package Co_DailyCode;

import java.util.ArrayList;
import java.util.Stack;

public class ax_dfs {
    public static void main(String[] args) {
        tree root = new tree("1");
        tree rootChild1 = root.addChildNode(new tree("2"));
        tree rootChild2 = root.addChildNode(new tree("3"));
        tree leaf1 = rootChild1.addChildNode(new tree("4"));
        tree leaf2 = rootChild1.addChildNode(new tree("5"));
        System.out.println(dfs(root));
    }

    private static ArrayList<String> dfs(tree node) {
        // 결과 담을 배열
        ArrayList<String> values = new ArrayList<>();
        // 시작 노드 삽입
        values.add(node.getValue());

        // 자식 노드가 있다면
        if (node.getChildrenNode() != null) {
            // 반복, 자식 노드 개수 만큼
            for (int i = 0; i < node.getChildrenNode().size(); i++) {
                // 재귀를 사용해 도달하는 자식노드를 cur 에 넣어줌
                ArrayList<String> cur = dfs(node.getChildrenNode().get(i));
                // 처리가 완료되면 cur을 결과 value 리스트에 담음
                values.addAll(cur);
            }
        }
        // 자식 노드가 없다면
        return values;
    }
}
class tree {
    private String value;
    private ArrayList<tree> children;

    public tree(String data) {
        this.value = data;
        this.children = null;
    }

    public tree addChildNode(tree node) {
        if(children == null) children = new ArrayList<>();
        children.add(node);
        return children.get(children.size() - 1);
    }

    public String getValue() {
        return value;
    }

    public ArrayList<tree> getChildrenNode() {
        return children;
    }
}