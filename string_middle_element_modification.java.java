import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int n = str.length();
       int mid = n/2;
       
       String result;
       
       if(n%2 == 1)
       {
           result = str.substring(0, mid)+ "*" + str.substring(mid + 1);
       }else{
           result = str.substring(0, mid - 1)+ "**" + str.substring(mid+1);
       }
       System.out.println(result);
    }
}