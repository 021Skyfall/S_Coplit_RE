package Co_DailyCode;

import java.util.*;

public class ay_bfs {
    public static void main(String[] args) {
        tree root = new tree("1");
        tree rootChild1 = root.addChildNode(new tree("2"));
        tree rootChild2 = root.addChildNode(new tree("3"));
        tree leaf1 = rootChild1.addChildNode(new tree("4"));
        tree leaf2 = rootChild1.addChildNode(new tree("5"));
        System.out.println(bfs(root));
    }
    private static ArrayList<String> bfs(tree node) {
//        Queue<String> result1 = new LinkedList<>();
//        Boolean[] visited = new Boolean[node.children.size()+1];
//        result1.add(node.getValue());
//        String x;
//
//        while (result1.size() != 0) {
//            x = result1.poll();
//            for (int i = 0; i < node.children.size(); i++) {
//                if (visited[i].equals(false)) {
//                    visited[i] = true;
//                    result1.add(node.getValue());
//                }
//            }
//        }
//        return (ArrayList<String>) result1;
        // 탐색을 위해 Q 선언
        Queue<tree> queue = new LinkedList<>();
        // 결과 리스트
        ArrayList<String> result = new ArrayList<>();
        // 시작 노드를 큐에 삽입
        queue.add(node);

        // Q가 비어있지 않으면 반복
        while(queue.size() > 0) {
            // 새로운 변수에 시작 노드 뽑아서 할당
            tree cur = queue.poll();
            // 뽑힌 q 값을 결과 리스트에 String 으로 삽입
            result.add(cur.getValue());
            // 시작 노드의 자식 노드가 있다면
            if (cur.getChildrenNode() != null) {
                //해당 자식 노드를 q 에 할당 후 다시 while 반복
                queue.addAll(cur.getChildrenNode());
            }
        }
        return result;
    }

    //아래 클래스의 내용은 수정하지 말아야 합니다.
    private static class tree {
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

        public String getValue() {      //현재 노드의 데이터를 반환
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
