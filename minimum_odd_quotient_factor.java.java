import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long factor = 1;
        
        
        while (N % 2 == 0) {
            N /= 2;
            factor *= 2;
        }
        
        System.out.println(factor);
    }
}
