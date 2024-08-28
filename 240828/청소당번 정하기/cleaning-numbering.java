import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int c = 0, r = 0, b = -1;
        int n = sc.nextInt();

        for(int i = 0; i<=n; i++){

            if(i%2==0 && i%3!=0 && i%12!=0){
                c++;
            }
            if(i%3==0 && i%12!=0){
                r++;
            }
            if(i%12==0){
                b++;
            }
        }

        System.out.print(c + " " + r + " " + b);

 
        }
        
        
        
    }