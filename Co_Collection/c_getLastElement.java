package Co_Collection;

import java.util.ArrayList;

public class c_getLastElement {
    public static void main(String[] args) {
        c_getLastElement c = new c_getLastElement();
        ArrayList<String> x = new ArrayList<>();
        x.add("์ฝ");
        x.add("๋");
        x.add("์กฐ");
        x.add("์");
        System.out.println(c.getLastElement(x));
    }
    public String getLastElement(ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) return null;
        return arrayList.get(arrayList.size()-1);
    }
}
