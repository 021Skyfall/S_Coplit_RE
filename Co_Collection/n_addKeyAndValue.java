package Co_Collection;

import java.util.HashMap;

public class n_addKeyAndValue {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        System.out.println(addKeyAndValue(map,"f",3));
    }
    public static HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
        hashMap.put(key,value);
        return hashMap;
    }
}
// 리턴 타입이 달라서