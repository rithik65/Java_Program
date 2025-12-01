import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int index = 0;

        while ((index = sentence.indexOf(word, index)) != -1) {
            count++;
            index = index + word.length();  
        }

        if (count == 0)
            System.out.print("-1");
        else
            System.out.print(count);
    }
}
