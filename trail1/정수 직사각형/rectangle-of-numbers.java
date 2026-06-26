import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        int[][] array = new int[N][M];


        int s = 1;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                array[i][j] = s;
                s++;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(array[i][j] + " ");

            }
            System.out.println("");
        }
    }
}