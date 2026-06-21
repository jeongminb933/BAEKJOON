import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(); int a2 = sc.nextInt();

        int[] array = new int[10];
        array[0] = a1; array[1] = a2;
        for (int i = 0; i < 8; i++){
            array[i+2] = (2*array[i]) + array[i+1];
        }
        for (int i = 0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
    }
}