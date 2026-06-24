import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        char a = sc.next().charAt(0);
        // Please write your code here.
        int b =0;
        for (int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == a) b++;
        }
        System.out.print(b);
    }
}