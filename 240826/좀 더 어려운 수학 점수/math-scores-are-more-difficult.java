import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();
        

        if (a>c){
            System.out.print("A");
        }
        else if (a<c) {
            System.out.print("B");
        }
        else{
            if (b>d){
            System.out.print("A");
        }
        else {
            System.out.print("B");
        }
        }

    


    }
}