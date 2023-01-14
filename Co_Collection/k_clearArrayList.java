package Co_Collection;

import java.util.ArrayList;

public class k_clearArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        System.out.println(clearArrayList(x));
    }
    public static ArrayList<Integer> clearArrayList(ArrayList<Integer> arrayList) {
        arrayList.removeAll(arrayList);
        return arrayList;
    }
}
// .removeAll() 도 .remove() 와 마찬가지로 리턴 타입이 boolean 이네