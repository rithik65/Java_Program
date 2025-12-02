import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Boolean isPrime = true;
        
        if(N <= 1){
            isPrime = false;
        }
        else{
         for(int i=2;i<=Math.sqrt(N);i++){
            if(N % i == 0){
                isPrime = false;
                break;
            }
         
        }
    }
    if(isPrime){
        System.out.println("yes");
    }else{
        System.out.println("no");
    }
}
}
