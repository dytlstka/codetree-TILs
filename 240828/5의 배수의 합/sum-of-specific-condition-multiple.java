import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        if(a>b){

            for(int i = b; b<=a; i++){
                if(i%5==0){
                    cnt+=i;
                }
            }
        }
        else
            {
                for(int i = a; a<=b; i++){
                    if(i%5==0){
                        cnt+=i;
                    }
                }
            }
        
        System.out.print(cnt);
    }
}