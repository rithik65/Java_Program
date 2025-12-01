import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long ans = 1;
        
        while(ans <= N)
        {
            ans = ans * 2;
        }
        System.out.println(ans);
    }
}