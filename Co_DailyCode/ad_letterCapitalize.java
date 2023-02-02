package Co_DailyCode;

public class ad_letterCapitalize {
    public static void main(String[] args) {
        System.out.println(letterCapitalize("java  is good"));
//        String x = "java  is good";
//        System.out.println(Arrays.toString(x.split(" ")));
//
//        System.out.println();
    }
    private static String letterCapitalize(String str) {
        String[] arr = str.split(" ");
        String result = "";
//        for (String s : arr) {
//            if (s.equals(" ")) {
//                s += " ";
//            } else {
//                result += s.substring(0,1).toUpperCase() + s.substring(1)+" ";
//            }
//
//        }
//        result = result.substring(0,result.length()-1);
//        return str.equals("") ? "" : result;

//        //https://velog.io/@qaer07/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-JadenCase-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%A7%8C%EB%93%A4%EA%B8%B0
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].equals("")) {
//                result += arr[i];
//            } else {
//                result += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
//            }
//            // 마지막 순회에 도달하면 공백 추가해서 문자 사이 띄워 주고
//            if (i < arr.length-1) {
//                result += " ";
//            }
//        }
//        if (" ".equals(str.substring(str.length()-1))) result += " ";
//        return str.equals("") ? "" : result;
        // 구글링한 이것도 안먹히네 프로그래머스 문제라는데 이건

        for (int i = 0; i < arr.length; i++) {
            // 연속된 공백이 있는 경우 그냥 그대로
            if (arr[i].isEmpty()) {
                arr[i] = arr[i];
            } else {
                // arr 요소 하나씩 뽑아서 맨 앞글자를 chrAt 으로 뽑아서 대문자로 바꿔주고
                // 다시 String 타입으로 형변환 + 해당 문자열 맨 첫글자 이외를 이어 붙여줌
                arr[i] = String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
            }
        }
        result = String.join(" ",arr); // 다시 중간에 공백 넣고 arr 을 문자열로 컴바인
        return str.length() == 0 ? "" : result;
    }
}
// 문자열의 공백을 기준으로 문자열 잘라서 앞글자 대문자 + 나머지 글자
// 이런 식으로 반복해서 중간중간 공백 붙여주고
// 마지막 글자 공백 잘라준 방식인데...
// 공백이 연속되면 StringIndexOutOfBoundsException ...
// 흠...
// 일단 Split 이 어떻게 갈라지는지 확인 좀
// "java  is good" ~> [java, , is, good]
// 공백이 한칸 더 생기는데 이거 때문인듯?
// 일단 문자가 잘릴때 중간에 공백이 나오면 그대로 두어야 할 거 같다

// 로직자체는 쉬운데 의외로 연속 공백 때문에 많이 헷갈렸음