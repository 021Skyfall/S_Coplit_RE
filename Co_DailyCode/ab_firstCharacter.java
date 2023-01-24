package Co_DailyCode;


public class ab_firstCharacter {
    public static void main(String[] args) {
        ab_firstCharacter b = new ab_firstCharacter();
        System.out.println(b.firstCharacter("hello world"));
    }
    public String firstCharacter(String str) {
        // if (str.isEmpty()) return "";
        // String[] x = str.split(" ");
        // String y = "";
        // for (String i : x) {
        //   y += i.charAt(0);
        // }
        // return y;

        if (str.isEmpty()) return "";
        String[] x = str.split(" ");
        StringBuilder y = new StringBuilder();
        for (String i : x) {
            y.append(i.charAt(0));
        }
        return y.toString();
    }
}
// 배열을 하나 씩 뽑은 다음에 캐릭터앳 으로 맨 앞자만 다시 뽑아야함
// 그러니까 x 의 요소를 하나 뽑고 맨 앞자만 따오고
// 반복해서 y에 더하기

// StringBuilder 클래스의
// .append() : 선택된 요소의 마지막에 새로운 요소를 추가함