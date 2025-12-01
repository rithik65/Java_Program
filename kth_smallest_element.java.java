import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  
        int K = sc.nextInt();  
        
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        ArrayList<Integer> distinct = new ArrayList<>();
        distinct.add(arr[0]);
        
        for (int i = 1; i < N; i++) {
            if (arr[i] != arr[i - 1]) {
                distinct.add(arr[i]);
            }
        }
        

        if (K > distinct.size() || K <= 0) {
            System.out.println(-1);
        } else {
            System.out.println(distinct.get(K - 1));
        }
    }
}
