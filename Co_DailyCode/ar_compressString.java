package Co_DailyCode;

public class ar_compressString {
    public static void main(String[] args) {
        System.out.println(compressString("wwwggoppopppp"));
    }
    private static String compressString(String str) {
//        // 관리 편하게 스트링 빌더
//        StringBuilder sb = new StringBuilder();
//        // 반복으로 해당 문자 개수 저장
//        int count = 1;
        // 반복 시작
        // 전달인자 문자열 길이 만큼
//        for (int i = 0; i < str.length(); i++) {
//            // 기준 문자 하나씩 뽑기
//            char ch = str.charAt(i);
//            // 마지막까지 순회 후 문자열 생성 후 break
//            if (i== str.length()-1){
//                sb.append(count+""+str.charAt(i));
//                break;
//            }
//            // 3연속 문자 압축
//            if (ch == str.charAt(i+1)) {
//                count++;
//            } else if (count == 3) {
//                sb.append(count+""+str.charAt(i));
//                count = 1;
//            }
//        }
//        return sb.toString();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (i == str.length()-1) break;
//            if (ch == str.charAt(i+1)) {
//                count++;
//            } else if (count == 3) {
//                sb.append(count+""+str.charAt(i));
//                count = 1;
//            }
//            sb.append(str.charAt(i));
//        }
//        return sb.toString();
//
//        // 문자 개수 카운트
//        int count = 1;
//        // 붙여줄 문자열
//        String newStr = "";
//        // 전달인자 문자열 길이만큼 반복
//        for (int i = 0; i < str.length(); i++) {
//            // 현재 char 과 다음 char 이 같으면 count++
//            if (str.charAt(i) == str.charAt(i+1)){
//                count++;
//            }
//            // count 가 3 이하고 현재 char 과 다음 char 이 같지 않다면 그대로 이어 붙여주고 count 1로 초기화
//            else if (count >= 3 && str.charAt(i) != str.charAt(i+1)) {
//                newStr += str.charAt(i);
//            }
//            // 위에서 걸러지지 않는다면 압축
//            else {
//                for (int j = 0; j <= count; j++) {
//                    newStr += str.charAt(i);
//                }
//                count = 1;
//            }
//        }
//        return newStr;
        // 동일 문자 카운트
        // 엣지 케이스
        if (str.length() == 0) return "";

        int count = 1;
        // 시작 기준 문자
        char old = str.charAt(0);
        // 결과를 담을 문자열
        String newStr = "";
        // 제일 마지막 문자도 연속되는 경우 때문에 추가된 더미 문자
        str = str + ' ';

        // 전달인자 문자열 길이만큼 반복 시작
        // 기준 문자를 0 인덱스로 잡았기때문에 1부터 시작
        for (int i = 1; i < str.length(); i++) {
            // 이전 문자와 다음 문자가 같다면
            if (old == str.charAt(i)) {
                // count 추가
                count++;
            }
            // 같지 않다면
            else {
                // 이전 문자와 다음 문자가 같지 않지만 count 가 3 이상이면
                if (count >= 3) {
                    // 결과 담을 문자열 + 카운트 + 카운트 기준이 되었던 문자
                    newStr = newStr + count + old;
                }
                // 3 이상이 아니라면
                else {
                    // 반복되었던 문자를 결과 문자열에 추가
                    for (int j = 0; j < count; j++) {
                        newStr += old;
                    }
                }
                // 시작 기준 문자를 현재 들어온 문자로 치환 후
                old = str.charAt(i);
                // 다시 처음부터 카운트
                count = 1;
            }
        }
        return  newStr;
    }
}
