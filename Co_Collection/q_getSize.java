package Co_Collection;

import java.util.HashMap;

public class q_getSize {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        System.out.println(getSize(map));
    }
    public static int getSize(HashMap<String, Integer> hashMap) {
        return hashMap.size();
    }
}
