import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int rank = a == 100 ? 0 : 1;

        if (rank == 0) {
            System.out.print("pass");
        }
        else {
            System.out.print("failure");
        }

        
        
    }
}