package Co_Collection;

import java.util.ArrayList;

public class b_getNthElement {
    public static void main(String[] args) {
        b_getNthElement b = new b_getNthElement();
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            x.add(i);
        }
        System.out.println(b.getNthElement(new ArrayList<>(x),2));
    }
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        if (arrayList.isEmpty() || index > arrayList.size()) return null;
        return arrayList.get(index);
    }
}
