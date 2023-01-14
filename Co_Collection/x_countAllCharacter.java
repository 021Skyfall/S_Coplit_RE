package Co_Collection;

import java.util.HashMap;

public class x_countAllCharacter {
    public static void main(String[] args) {
        System.out.println(countAllCharacter("banana"));
    }
    public static HashMap<Character, Integer> countAllCharacter(String str) {
        HashMap<Character, Integer> x = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char y = str.charAt(i);
            if (x.containsKey(y)) {
                int z = x.get(y);
                x.put(y,z+1);
            } else x.put(y,1);
        }
        return x;
    }
}
// 키가 중복이 되지 않는 HashMap 타입의 특성을 이용한 문제 였음
// for 문으로 str 의 문자를 순회함
// y 는 "banana"의 'b' 임
// 조건 안걸림 맨 처음엔 x 가 빈 깡통 해쉬맵이니까
// else 로 들어가서 1을 값으로 갖고 넣어짐
// a 와 n 도 마찬가지
// 이제 a 가 또 들어가게되면
// 조건에 걸림
// 조건 중에 z 는 'a' 가 가진 값인 1 이 할당됨
// 그 다음에 키로는 'a' 를 다시 넣고
// 원래 갖고 있던 1에 1을 더함 = 2
// 키는 중복이 안되기 때문에 원래 있던 키의 값에 +1 이 되는 거임
// 그렇게 중복된 키가 나올때마다 키와 값이 합쳐짐
// 이런 로직임