import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s1 = sc.next();
       String s2 = sc.next();
       
       boolean present[] = new boolean[256];
       
       for(char c : s1.toCharArray()){
           present[c] = true;
       }
       
        for(char c : s2.toCharArray()){
           if(present[c]){
               System.out.print("yes");
               return;
           }
       }
       System.out.print("no");
    }
}
