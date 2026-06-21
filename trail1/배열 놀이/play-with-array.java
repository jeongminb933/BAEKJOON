import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); int Q = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < Q; i++){
            switch(sc.nextInt()){
                case 1:
                    System.out.println(array[sc.nextInt()-1]);
                    break;
                case 2:
                    boolean isExisted = false;
                    int b = sc.nextInt();
                    for(int j = 0; j < N; j++){
                        if ( b== array[j]){
                            isExisted = true;
                            System.out.println(j+1);
                            break;
                        }
                    }
                    if (!isExisted) System.out.println("0");
                    break;
                case 3:
                    int s = sc.nextInt(); int e = sc.nextInt();
                    for (int j = s-1; j<e; j++){
                        System.out.print(array[j]+" ");
                    }
                    System.out.print("\n");
                    break;
                

            }
        }
    }
}