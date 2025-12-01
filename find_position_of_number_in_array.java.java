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
        int index = - 1;
        int i = 0;
        
        while(i < N){
            if(arr[i] == M){
                index = i + 1;
                break;
            }
            i += Math.abs(arr[i] - M);
        }
        
        System.out.print(index); 
    }
}