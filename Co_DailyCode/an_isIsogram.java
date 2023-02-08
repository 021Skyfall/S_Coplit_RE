package Co_DailyCode;

import java.util.HashMap;

public class an_isIsogram {
    public static void main(String[] args) {
        System.out.println(isIsogram("  "));
    }
    private static boolean isIsogram(String str) {
        // 비교 해줄 문자 하나씩 뽑아서 저장
        String result = "";
        // 대소문자 구별없다는걸 못 봤네
        str = str.toLowerCase();
        // 순회하면서 하나 씩 비교함
        for (int i = 0; i < str.length(); i++) {
            // 먼저 str i 번째 문자가 result 에 있는지 없는지 확인하고
            if (result.contains(String.valueOf(str.charAt(i)))) return false;
            // 없으면 합쳐줌 있으면 위에서 걸러짐
            else result += str.charAt(i);
        }
        // str 이 빈 문자열일 경우에도 그냥 result 에 합쳐 주기 때문에 엣지케이스가 따로 필요한 경우는 아니었음
        // 단, 공백을 연속으로 입력 받으면 false 임 -> 근데 입력 받는 문자는 무조건 공백이 없는 문자열임
        return true;
    }
    // 아니 근데 리퍼런스 코드 보니까 뭔 해쉬맵을 썼네
    private static boolean hash(String str) {
        // 알파벳 저장할 해쉬맵 선언
        HashMap<Character, String> cache = new HashMap<>();
        // 마찬가지로 소문자로 변경
        str = str.toLowerCase();

        // 문자열 순회
        for (int i = 0; i < str.length(); i++) {
            // 해쉬맵에 해당 문자가 이미 저장되어있다면 false 리턴
            if (cache.containsKey(str.charAt(i))) return false;
            // 없다면 해쉬맵 키로 저장 -> 키는 중벅 안댐 -> 는 어차피 위에서 걸러주긴하네
            cache.put(str.charAt(i),"Exist");
        }
        return true;
    }
    // 근데 이거 딱히 키가 중복안되는 특성을 사용할 필요도 없고
    // 어차피 순회하면서 if 에 걸리면 false 리턴이기 때문에 굳이?긴 하다...
}

