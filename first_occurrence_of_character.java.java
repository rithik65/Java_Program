import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char ch = sc.next().charAt(0);
        int index = S.indexOf(ch);
        
        if(index == -1){
            System.out.print("-1");
        }else{
            System.out.print(index + 1);
        }
    }
}