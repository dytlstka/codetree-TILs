import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
             for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < 2 * n - 1 - 2 * i; j++) {
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}



/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
       
        for(int i = n; i > 0; i--){
            for(int k = 0; k < 2i-1; k++ ){
                System.out.print("*");
            }

            for()


        }

        
        
    }
}
*/