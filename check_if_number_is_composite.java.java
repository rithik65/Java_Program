import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        boolean div = false;
        
        if(N <= 1){
            div = false;
        }
        
        for(int i=2;i*i<=N;i++){
            if(N % i == 0){
                 div = true;
                 break;
            }
        }
        
        if(div){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}