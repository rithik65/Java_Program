import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String odd="";
       String even="";
       for(int i=0;i<s.length();i++){
          
           if(i%2==1){
               odd += s.charAt(i);
           }else{
                even += s.charAt(i);
           }
       }
       System.out.print(even +" "+odd);
    }
}
