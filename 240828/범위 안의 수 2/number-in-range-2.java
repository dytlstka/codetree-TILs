import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int Sum = 0;
        double n = 0;
        for( int i = 1; i <= 10; i++){

            int k = sc.nextInt();
            if(k>=0 && k<=200){
                Sum += k;
            n++;
            }

        }
        n = (double)Sum / n;

        System.out.printf("%d %.1f", Sum, n);
        
    }
}