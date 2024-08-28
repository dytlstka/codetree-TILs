import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        double f = 0;
        int n = 0;
        while(true){

            int k = sc.nextInt();
            if(k<30){
                f+=k;
                n++;
            }
            else
                break;

            
        }
        f = f/n;

        System.out.printf("%.2f", f);
    }
}