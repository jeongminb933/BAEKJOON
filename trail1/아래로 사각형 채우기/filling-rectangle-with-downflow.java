import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] array = new int[N][N];

        int num = 1;
        int s = 0;
        for(int i = 0; i < N; i++){
            s=0;
            for(int j = 0; j < N; j++){

                    array[i][j] = (i+1)+(s*N);

                s++;
            }            
        }
        for(int i = 0; i < N; i++){

            for(int j = 0; j < N; j++){

                System.out.print(array[i][j]+" ");

            }            
            System.out.println("");
        }

    }
}