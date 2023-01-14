package Co_Collection;

import java.util.HashMap;

public class m_getValue {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        System.out.println(getValue(map,"c"));
    }
    public static Integer getValue(HashMap<String, Integer> hashMap, String key) {
        return hashMap.get(key);
    }
}