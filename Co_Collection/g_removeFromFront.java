package Co_Collection;

import java.util.ArrayList;

public class g_removeFromFront {
    public static void main(String[] args) {
        g_removeFromFront g = new g_removeFromFront();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        System.out.println(g.removeFromFront(x));
    }
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        return arrayList.remove(0);
    }
}
// remove() 는 호출된 리스트의 인덱스를 매개변수 인자로 받고 지워줌
// 근데 리턴 값이 지워진 그 값임