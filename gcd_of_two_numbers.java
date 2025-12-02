import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        N = Math.abs(N);
        M = Math.abs(M);
        
        int gcd=0;
        int max;
        if(N>M){
            max = N;
        }else{
            max = M;
        }
        
        if(N > 0 && M > 0){
            for(int i=1;i<=max;i++){
                if(N%i==0 && M%i==0){
                    gcd = i;
                }
            }
            System.out.print(gcd);
        }else{
            System.out.print("-1");
        }
    }
}
