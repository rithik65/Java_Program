import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();
        for (int i = 0; i < N; i++) B[i] = sc.nextInt();

        
        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0, j = 0;
        ArrayList<Integer> out = new ArrayList<>();

        while (i < N && j < N) {
            if (A[i] == B[j]) {
                int val = A[i];
                
                if (out.isEmpty() || out.get(out.size() - 1) != val) {
                    out.add(val);
                }
                
                while (i < N && A[i] == val) i++;
                while (j < N && B[j] == val) j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        if (out.isEmpty()) {
            System.out.print("-1");
        } else {
          
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < out.size(); k++) {
                if (k > 0) sb.append(' ');
                sb.append(out.get(k));
            }
            System.out.print(sb.toString());
        }
    }
}
