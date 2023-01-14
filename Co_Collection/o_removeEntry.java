package Co_Collection;

import java.util.HashMap;

public class o_removeEntry {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        removeEntry(map,"a");
        System.out.println(map);
    }
    public static void removeEntry(HashMap<String, Integer> hashMap, String key) {
        hashMap.remove(key);
    }
}
