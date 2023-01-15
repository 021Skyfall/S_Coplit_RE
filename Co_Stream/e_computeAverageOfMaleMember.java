package Co_Stream;

import java.util.Arrays;
import java.util.List;

public class e_computeAverageOfMaleMember {
    public static void main(String[] args) {
        Member coding = new Member("coding", "Female", 25);
        Member hacker = new Member("hacker", "Male", 30);
        Member ingi = new Member("ingi", "Male", 32);
        List<Member> members = Arrays.asList(coding, hacker, ingi);
        System.out.println(computeAverageOfMaleMember(members));
    }
    public static double computeAverageOfMaleMember(List<Member> members){
        return members.stream().filter(e -> e.getGender().equals("Male"))
                .mapToDouble(Member::getAge).average().orElse(0.0);
    }
    // 필터로 "Male" 만 걸러주고 더블 타입 리턴이니까 더블로 map 해주고
    // 그 중에서도 Member 의 age 만 가져와서 더블로, 그다음에 평균 내고
    // 엣지 케이스 처리
    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
