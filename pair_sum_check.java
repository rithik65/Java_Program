import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int arr[] = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        int left = 0, right = N - 1;
        boolean found = false;
        
        while(left < right){
            int sum = arr[left] + arr[right];
            
            if(sum == X){
                found = true;
                break;
            }
            else if(sum < X){
                left++;
            }else{
                right--;
            }
        }
        if(found){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
        
    }
}
