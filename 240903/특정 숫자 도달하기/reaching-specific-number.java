import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] Arr = new int[10];
        double av = 0;
        int sum = 0;
        int c = 0;
        for(int i  = 0; i < 10; i++){
            Arr[i] = sc.nextInt();
            if(Arr[i] < 250){
                sum += Arr[i];
                c++;
                

            }
            else{
                break;
            }
        }
        av = (double)sum / c;

        System.out.printf("%d %.1f",sum, av);



    }
}