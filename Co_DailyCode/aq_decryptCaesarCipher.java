package Co_DailyCode;

public class aq_decryptCaesarCipher {

    public static void main(String[] args) {
        aq_solution solution = new aq_solution();
        di d = new di(solution);
        System.out.println(d.method("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25));
    }

}
class di {
    aq_solution solution;

    public di(aq_solution solution) {
        this.solution = solution;
    }

    public String method(String str, int secret) {
        return solution.decryptCaesarCipher(str,secret);
    }
}

class aq_solution {
    // 카이사르 암호(Caesar cipher)
    public String decryptCaesarCipher(String str, int secret) {
        // 기준 알파벳
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        // 합쳐줄 문자열
        String result = "";

        // 전달인자 str 길이 만큼 반복
        for (int i = 0; i < str.length(); i++) {
            // 공백은 그대로
            if (str.charAt(i) == ' ') result += str.charAt(i);
            else {
                // 기준 알파벳에서 현재 문자열의 인덱스 찾은 후
                int asis = alpha.indexOf(str.charAt(i));
                // 복호화는 반대이기 때문에 secret 뺌
                // 알파벳을 넘어가게 되면 알파벳 길이를 더 해주고 알파벳 길이 나눈 나머지 리턴
                int tobe = (asis - secret + alpha.length()) % alpha.length();
                // 알파벳의 해당 문자 더해줌
                result += alpha.charAt(tobe);
            }
        }
        return result;
//    public String decryptCaesarCipher(String str, int secret) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') result += str.charAt(i);
//            else result += Character.toString((str.charAt(i)-26 - secret + 26 ) % 26);
//        }
//        return result;
    }
}
/*
* "khoor", 3 가정
* 반복 시작
* k 뽑고 알파벳 판에서 k의 인덱스 리턴
* asis = 11
* tobe = ( 11 - 3 + 26 ) % 26
* 남는 수는 알파벳 판의 tobe 인덱스 문자
*/