import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 변수 선언 및 입력
        int n;
        int sum = 0;
        n = sc.nextInt();
        
        
        for(int i = 1; i <= n; i++) {
            
            sum+=i;
            

            if(sum>n){
                break;
            }
        }

        System.out.print(sum);
    }
}