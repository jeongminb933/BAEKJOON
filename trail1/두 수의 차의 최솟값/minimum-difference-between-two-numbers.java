import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        int min = array[1] - array[0];
        for(int i = 0; i < N-1; i++){
            if(array[i+1] - array[i] < min){
                min = array[i+1] - array[i];
            }
        }
        System.out.print(min);
}
}