import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = 30.48 * a;
        
        System.out.printf("%.1f", b);

    }
}