package Co_Collection;

import java.util.ArrayList;

public class a_makeArrayList {
    public static void main(String[] args) {
        a_makeArrayList a = new a_makeArrayList();
        System.out.println(a.makeArrayList());
    }
    public ArrayList<Integer> makeArrayList() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arr.add(i);
        }
        return arr;
    }
}
