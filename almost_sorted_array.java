import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        int index = -1;
        
        for(int i=0;i<N-1;i++){
            if(arr[i] > arr[i+1]){
                count++;
                index = i;
            }
        }
        
        if(count == 0){
            System.out.print("-1");
        }else if(count == 1){
            System.out.print(index);
        }else{
            System.out.print("-1");
        }
    }
}
