import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int[] arr = new int[10];
        
        arr[0] = n1;
        arr[1] = n2;


        for(int n = 2; n < 10; n++){
            arr[n] = arr[n-1] + 2*arr[n-2];
        }


        for(int i = 0; i<10; i++){

            System.out.print(arr[i] + " ");
            
        }
    }
}