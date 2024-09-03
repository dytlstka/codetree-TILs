import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.


        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int[] Arr = new int[b+1];
        int[] CountArr = new int[b];
        

        for(int i = 0; i<b+1; i++){

            Arr[i] = a%b;
            CountArr[Arr[i]]++;
            a = a/b;
        }



        for(int i = 0; i<b; i++){

            CountArr[i] *= CountArr[i];
            sum += CountArr[i];
        }

        System.out.print(sum);
    }
}