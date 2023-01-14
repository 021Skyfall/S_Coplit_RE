package Co_Collection;

import java.util.HashMap;

public class v_isMember {
    public static void main(String[] args) {
        HashMap<String, String> member = new HashMap<String, String>();
            member.put("kimcoding", "1234");
            member.put("parkhacker", "qwer");
        System.out.println(isMember(member,"kimcoding", "1234"));
        System.out.println(isMember(member,"asd","532"));
        System.out.println(isMember(member,"kimcoding","6"));

    }
    public static boolean isMember(HashMap<String, String> member, String username, String password) {
//        return !member.containsKey(username) ? false : member.get(username).equals(password);
        return member.containsKey(username) && member.get(username).equals(password);
    }
}
