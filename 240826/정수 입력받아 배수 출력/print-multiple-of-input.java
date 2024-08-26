import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = n;
        for(int a = 1; a<=5 ; a++){
            System.out.print(n);
            n += p; 

        }
        
    }
}