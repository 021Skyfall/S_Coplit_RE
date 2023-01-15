package Co_Stream;

import java.util.Arrays;
import java.util.List;

public class d_computeCountOfFemaleMember {
    public static void main(String[] args) {
        Member coding = new Member("coding", "Female");
        Member hacker = new Member("hacker", "Male");
        List<Member> members = Arrays.asList(coding, hacker);
        System.out.println(computeCountOfFemaleMember(members));
    }
    public static long computeCountOfFemaleMember(List<Member> members) {
        return members.stream().filter(e -> e.getGender().equals("Female"))
                .count();
    }
    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }
}
// long 타입 리턴이고
// 필터로 female 이 게터 젠터와 같은거
// count 로 세주면 긑