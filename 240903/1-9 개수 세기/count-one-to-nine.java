import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[10];


        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
            arr2[arr1[i]]++;
        }

        for(int i = 1; i < 10; i++){
            System.out.println(arr2[i]);
        }
    }
}