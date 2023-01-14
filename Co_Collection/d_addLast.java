package Co_Collection;

import java.util.ArrayList;

public class d_addLast {
    public static void main(String[] args) {
        d_addLast d = new d_addLast();
        ArrayList<String> x = new ArrayList<>();
        x.add("코");
        x.add("드");
        x.add("조");
        x.add("아");
        String y = "나도";
        System.out.println(d.addLast(x,y));

    }
    public ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
        System.out.println(arrayList.add(str));
        return arrayList;
    }
}
// 어차피 .add() 메소드가 순서대로 객체 추가해주는 메소드
// 근데 이거 웃긴게 .add() 는 리턴 타입이 boolean 임
// 마우스 갖다 대면 앎 ㅋㅋ
// 그래서 현재 리턴 타입은 ArrayList<String> 타입 이기 때문에
// ArrayList 를 리턴해야함 ㄷㄷ
