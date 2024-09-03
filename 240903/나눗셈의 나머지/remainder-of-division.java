import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.


        Scanner sc = new Scanner(System.in);


        int p = sc.nextInt();
        int b = sc.nextInt();

        int a = p;
        int sum = 0;
        
        int[] CountArr = new int[b];

        int take = 0;

        while(true){
            
            if(p<=b){
                p = p/b;
                take++;
                break;
            }
            else{
                p = p/b;
                take++;
            }

        }
        int[] Arr = new int[take];

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