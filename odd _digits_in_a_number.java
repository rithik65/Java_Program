import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean found = false;
        String M = N+"";
        int digit = 0;
        for(int i=0;i<M.length();i++){
            char str = M.charAt(i);
            digit = str - '0';
             if(digit % 2 == 1) {
               if(found) System.out.print(" "); 
                System.out.print(digit);
                found = true;
            }
        }
        if(!found){
             System.out.print("-1");
        }
    }
}
