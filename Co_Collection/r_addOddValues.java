package Co_Collection;

import java.util.HashMap;

public class r_addOddValues {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        System.out.println(addOddValues(map));
    }
    public static int addOddValues(HashMap<String , Integer> hashMap) {
        int x = 0;
        for (int e : hashMap.values()) {
            if (e%2 == 0) x += e;
        }
        return x;
    }
}
