package Co_Collection;

import java.util.ArrayList;

public class i_removeFromBackOfNew {
    public static void main(String[] args) {
        i_removeFromBackOfNew i = new i_removeFromBackOfNew();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        System.out.println(i.removeFromBackOfNew(x));
    }
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        return arrayList.size() == 0 ?
                null : new ArrayList<>(arrayList.subList(0,arrayList.size()-1));
//        return new ArrayList<>(arrayList.remove(arrayList.size()-1));
    }
}
/* subList() 는 시작 인덱스, 끝 인덱스 를 인자로 받아서
* 그 인덱스의 해당하는 값을 리턴함
* 쉽게 말해 Array.copyOfRange 처럼 잘라서 복사가 가능한 것
* 근데 또 엄밀히 말하면 복사랑은 다르긴함 원본 arrayList 의 값을 지정한 범위만큼 갖고 올 수 있는거라
* 원본 -> 원본 이라는 소리임
* remove() 는 지운 값을 리턴하기 때문에 쓸 수 없음
*/
