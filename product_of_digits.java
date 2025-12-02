import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int pod = 1;
     while(n > 0){
          int dig = n%10;
          pod = pod*dig;
          n = n/10;
      }
      System.out.print(pod);
    }
}
