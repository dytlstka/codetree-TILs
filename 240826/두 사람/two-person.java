import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char a1 = sc.next().charAt(0);

        int b = sc.nextInt();
        char b1 = sc.next().charAt(0);
        
        if((a>=10 || b>=19) && (a1 == 'M' || b1 == 'M')){
            System.out.print(1);
        }
        else
            System.out.print(0);
    }
}