import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean sat = false;

        for (int i = 1; i<=5; i++){

            int k = sc.nextInt();

            if(k%3==0){
                continue;
            }
            else{
                break;
            }
            
        }
        if (sat = true){
            System.out.print(1);
        }
        else
            System.out.print(0);
    }
}