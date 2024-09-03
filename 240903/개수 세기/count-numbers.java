import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0;

        int[] Arr = new int[n];

        for(int i = 0; i < n; i++){
            Arr[i] = sc.nextInt();

            if(Arr[i]==m){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}