import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        Boolean found = false;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            
            if(arr[i] == K){
                found = true;
            }
        }
        
        if(found){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
        
    }
}