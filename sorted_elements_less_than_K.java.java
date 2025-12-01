import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int arr[] = new int[N];
        
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        
        ArrayList<Integer> set = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            if(arr[i] < K){
                set.add(arr[i]);
            }
        }
        
        if(set.isEmpty()){
            System.out.print(-1);
            return;
        }
        
        Collections.sort(set);
        
        for(int i=0;i<set.size();i++){
            System.out.print(set.get(i));
            if(i < set.size() - 1)System.out.print(" ");
        }
    }
}