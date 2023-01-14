package Co_Collection;

import java.util.HashMap;

public class s_addFullNameEntry {
    public static void main(String[] args) {
        HashMap<String , String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.put("e","5");
        System.out.println(addFullNameEntry(map));
    }
    public static HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        hashMap.put("set",hashMap.get("c")+hashMap.get("d"));
        return hashMap;
    }
}
