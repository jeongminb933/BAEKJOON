import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] array = new String[N];
    
        for (int i = 0; i < N; i++){
            array[i] = sc.next();
        }

        char a = sc.next().charAt(0);
        int num = 0;
        double aver = 0;
        for (int i = 0; i < N; i++){
            for(int j = 0; j < array[i].length(); j++){
                if(array[i].charAt(0) == a) {
                    num++;
                    aver += array[i].length();
                    break; 
                }

            }
        }
        System.out.printf("%d %.2f", num, aver / num);


    }
}