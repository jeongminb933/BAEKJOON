import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int M = sc.nextInt();
        int[][] array1 = new int[N][M];
        int[][] array2 = new int[N][M];



        for(int k = 1; k<3; k++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < M; j++){
                    if(k == 1) array1[i][j] = sc.nextInt();
                    if(k == 2) array2[i][j] = sc.nextInt();

                }
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){

                if(array1[i][j] == array2[i][j]) System.out.print("0 ");
                else System.out.print("1 ");
                    

            }
            System.out.println("");
        }
    }
}