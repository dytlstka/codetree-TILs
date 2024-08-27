import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 1;
        if(a>0){
            while(n<=b){
                System.out.print(a);
                n++;
            }
        }
        else
            System.out.print(0);
        
    }
}