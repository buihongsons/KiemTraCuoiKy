import java.util.HashSet;
import java.util.Set;

public class _929_Unique_Email_Addresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        StringBuilder sb = new StringBuilder();
        for(String email : emails) {
            sb.setLength(0);
            for(int i = 0; i < email.length(); i++) {
                char x = email.charAt(i);
                if(x == '@') {
                    while(i < email.length()) {
                        sb.append(email.charAt(i));
                        i++;
                    }
                    break;
                }
                if(x == '.') {
                    continue;
                }
                if(x == '+') {
                    while(email.charAt(i+1) != '@') {
                        i++;
                    }
                    continue;
                }
                sb.append(x);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
