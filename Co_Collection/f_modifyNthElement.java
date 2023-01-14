package Co_Collection;

import java.util.ArrayList;

public class f_modifyNthElement {
    public static void main(String[] args) {
        f_modifyNthElement f = new f_modifyNthElement();
        ArrayList<String> x = new ArrayList<>();
        x.add("코");
        x.add("드");
        x.add("조");
        x.add("아");
        System.out.println(f.modifyNthElement(x,0,"2"));
    }
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        arrayList.set(index,str);
//        arrayList.remove(index);
//        arrayList.add(index,str);
        return arrayList;
    }
}
// 특정 인덱스 지우고 삽입 = .set()
// 아래도 동일하게 작동해서 작성함