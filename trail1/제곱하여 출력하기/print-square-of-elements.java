import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array= new int[N];
        for (int i =0; i<N; i++){
            int temp = sc.nextInt();
            array[i] = temp*temp;
            System.out.print(array[i] + " ");
        }
    }
}