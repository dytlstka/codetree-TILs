import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // a = a + 5;
        //위와 동일 a + = 5;

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println( a + 8 );
        System.out.println( b * 3 );
        System.out.println((a + 8) * (b * 3));
    }
}