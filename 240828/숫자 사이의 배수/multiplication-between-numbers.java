import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int SumVal = 0;
        double t = 0;
        double k = 0;
        for (int i = a; i <= b; i++){
            if(i%5==0 || i%7==0){
                SumVal += i;
                k++;
            }
          

        }
        t= SumVal / (k);
        System.out.print(SumVal + " ");
        System.out.printf("%.1f", t);
    }
}