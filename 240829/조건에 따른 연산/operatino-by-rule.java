import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 0;
        while(true){

            if(n>=1000){
                System.out.print(l);
                break;
            }
            else if(n%2==0){
                n = n*3 + 1;
                l++;
            }
            else{
                n = n*2+2;
                l++;
            }
        }

        
        
    }
}