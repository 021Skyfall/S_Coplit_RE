package Co_Collection;

import java.util.ArrayList;

public class e_addNth {
    public static void main(String[] args) {
        e_addNth e = new e_addNth();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        System.out.println(e.addNth(x,0,2));
    }
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        if (arrayList.size() < index) return null;
        arrayList.add(index,element);
        return arrayList;
    }
}
// 컬렉션의 .add() 는 요소만 집어 넣을 경우 순차적으로 추가해주고
// index 를 먼저 넣는 경우에는 해당 인덱스에 요소를 삽입해줌