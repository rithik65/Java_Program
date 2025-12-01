import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int l = sc.nextInt();
       int B = sc.nextInt();
       int H = sc.nextInt();
       
       int n = l * B * H;
       int m = 2 *(l*B + B*H + H*l);
       System.out.print(m +" "+ n);
       
    }
}