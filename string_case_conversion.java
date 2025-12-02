import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(Character.isUpperCase(ch)){
                result.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                result.append(Character.toUpperCase(ch));
            }else{
                result.append(ch);
            }
        }
        System.out.print(result.toString());
    }
}
