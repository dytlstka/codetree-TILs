import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = 0;
        for(int i = 1; i <= n; i++){
            







            if(i%2==0 || i%3==0 || i%5==0){
                s++;
            }






        }

        System.out.print(n-s);
        
    }
}