import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String low = str.toLowerCase();
        
        
        StringBuilder scan = new StringBuilder(low);
        String reverse =  scan.reverse().toString();
        if(low.equals(reverse)){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}
