package Co_Collection;

import java.util.ArrayList;

public class h_removeFromNth {
    public static void main(String[] args) {
        h_removeFromNth h = new h_removeFromNth();
        ArrayList<String> x = new ArrayList<>();
        x.add("코");
        x.add("드");
        x.add("조");
        x.add("아");
        System.out.println(h.removeFromNth(x,2));
    }
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        return
                index < 0 || index >= arrayList.size() ?
                        null : arrayList.remove(index);
    }
}
