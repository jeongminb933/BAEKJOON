import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
        array[0] = "apple";
        array[1] = "banana";
        array[2] = "grape";
        array[3] = "blueberry";
        array[4] = "orange";

        char a = sc.next().charAt(0);
        int s = 0;
        for(int i = 0; i < 5; i++){
            if(array[i].charAt(2) == a || array[i].charAt(3) == a){
                s++;
                System.out.println(array[i]);

            }
        }
        System.out.println(s);



    }
}