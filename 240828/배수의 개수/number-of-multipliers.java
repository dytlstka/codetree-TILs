import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int cnt2 = 0;
        for (int i = 1; i<=10; i++){
            int p = sc.nextInt();
            if(p%3==0){
                cnt++;
            }
            if (p%5==0){
                cnt2++;
            }
            
        }
        System.out.print(cnt + cnt2);
        
        
    }
}