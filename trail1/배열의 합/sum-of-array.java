import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[4][4];
        for (int i = 0; i < 4; i++)
        {
            for (int j =0; j<4; j++){
                array[i][j] = sc.nextInt();
            }
            System.out.println(array[i][0]+array[i][1]+array[i][2]+array[i][3]);
        }

    }
}