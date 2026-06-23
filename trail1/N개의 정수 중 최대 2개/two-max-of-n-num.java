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
        int temp1 = array[0];
        int temp2 = 0;
        for(int i = 0; i<N; i++){
            if(array[i] > temp1){
                temp1 = array[i];
                temp2 = i;
            }
        }
        array[temp2] = array[0];
        array[0] = temp1;
        temp1 = array[1];
        temp2 = 1;
        for(int i = 1; i<N; i++){
            if(array[i] > temp1){
                temp1 = array[i];
                temp2 = i;
            }
        }
        array[temp2] = array[1];
        array[1] = temp1;
        System.out.print(array[0] + " " + array[1]);
    }
}