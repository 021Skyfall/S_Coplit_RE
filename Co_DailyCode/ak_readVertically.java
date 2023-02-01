package Co_DailyCode;

import java.util.Arrays;

public class ak_readVertically {
    public static void main(String[] args) {
        System.out.println(readVertically(new String[]{"hello", "wolrd",}));
        String x = "hello";
    }
    private static String readVertically(String[] arr) {
        // arr[0].charAt(0) + arr[1].charAt(0)
        // arr[0].charAt(1) + arr[1].charAt(1)

        // 배열 안 문자열 중 가장 긴 값 찾기
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i].length()) max = arr[i].length();
        }

        // 맨 위에 작성한 대로 문자열에서 추출하고 새로운 배열에 넣어줌
        // 새로운 배열의 크기는 위에서 걸러낸 가장 큰 문자열 만큼
        String[] result = new String[max];
        for (int i = 0; i < arr.length; i++) {
            // 배열의 문자를 순회하면서 뽑아옴
            String str = arr[i];
            // 해당 문자열 길이 만큼 반복 str 의 캐릭터 하나씩 뽑아서 결과 배열에 담음
            for (int j = 0; j < str.length(); j++) {
                if (result[j] == null) {
                    result[j] = Character.toString(str.charAt(j));
                } else {
                    // 결과 배열에 담음
                    result[j] += str.charAt(j);
                }
            }
        }
        // for(결과배열 길이) 결과 배열에 있는 요소를 문자열로 전부 합쳐줌
        String str = "";
        for (int i = 0; i < result.length; i++) {
            str += result[i];
        }
        return str;
    }
}
/* 흐름
 * "hello", "wolrd" 가정
 * hello = 5 / wolrd = 5
 * max = 5
 * result = {null, null, null, null, null}
 * for -> 2
 * str = hello
 * for -> 5
 * if (result[0] == null) ? true
 * result[0] = h
 * result[1] = e
 * result[2] = l
 * result[3] = l
 * result[4] = o
 * str = wolrd
 * for -> 5
 * if (result[0] == null) ? false
 * 나머지 싹 다 더해줌
 * result[0] = h+w
 * result[1] = e+o
 * result[2] = l+l
 * result[3] = l+r
 * result[4] = o+d
 */
// 아 for 문 안에서 좀 헷갈렷는데
// 맨 처음 자가 비어있으면 빈 자리에 맨 앞글자 넣고
// 나머지는 순회하면서 한 글자 씩 더 해주는거구나
// 그래서 결과 담을 배열 공간이 max 여도 괜찮은거고
// 아... 한글자씩 뽑아서 그 뒤에 다음 글자들 하나씩 붙여준다...
// 이 생각을 못 했다..