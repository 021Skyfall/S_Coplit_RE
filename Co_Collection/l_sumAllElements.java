package Co_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class l_sumAllElements {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        System.out.println(sumAllElements(x));
    }
    public static int sumAllElements(ArrayList<Integer> arrayList) {
        int x = 0;
//        for-each 사용
//        for (int e : arrayList) {
//            x += e;
//        }
//        return x;

//        Iterator 사용
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            x += iterator.next();
        }
        return x;
    }
}
