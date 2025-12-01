import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int ans = N-M;
        if (ans <= 0) {
            System.out.println("-1");
        } 
        else {
            for (int i = 0; i < ans; i++) {
                System.out.print(arr[i]);
                if (i < ans - 1) System.out.print(" "); 
            }
        }
    }
}