import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); int n2 = sc.nextInt();
        int[] array1 = new int[n1];
        int[] array2 = new int[n2];

        for (int i = 0; i < n1; i++){
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++){
            array2[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        if (n2 > n1) {System.out.print("No");
        System.exit(0);}
        while (true){
            if(j < n2){
                if (array1[i] == array2[j]){
                    for(int k = i+1; k < n1; k++){
                        j++;
                        if (j < n2){
                            if(array1[k] == array2[j]) {
                                if (j == (n2-1)) {
                                    System.out.print("Yes");
                                    System.exit(0);
                                }

                            } else{
                                j = 0;
                                break;
                            }
                        } else {System.out.print("No");
                        System.exit(0);
                        }

                        
                    }
                }
            } else System.out.print("No");
            i++;
            if(i == (n1-n2+1)) break;

            
        }
        System.out.print("No");

    }
}