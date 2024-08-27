import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        
        if (a>b){
            while (a >= b){
                System.out.print(a + " ");
                a--;
            }

        }
        else if ( b>a){
            while (b >= a){
                System.out.print(b + " ");
                b--;
            }
        }
        else
            System.out.print(a);
        

}
}