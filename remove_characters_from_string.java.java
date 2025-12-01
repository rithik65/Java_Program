import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();  
        String s2 = sc.next();  

        String result = removeCharacters(s1, s2);

        if (result.isEmpty()) {
            System.out.print("-1");
        } else {
            System.out.print(result);
        }
    }

    public static String removeCharacters(String s1, String s2) {
        
        HashSet<Character> set = new HashSet<>();
        for (char c : s2.toCharArray()) {
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
