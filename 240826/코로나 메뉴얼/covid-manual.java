import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력을 한 줄씩 처리하도록 변경
        String[] firstPerson = sc.nextLine().split(" ");
        String[] secondPerson = sc.nextLine().split(" ");
        String[] thirdPerson = sc.nextLine().split(" ");

        // 각 사람의 감기 증상과 체온을 변수에 저장
        char a = firstPerson[0].charAt(0);
        int a1 = Integer.parseInt(firstPerson[1]);
        char b = secondPerson[0].charAt(0);
        int b1 = Integer.parseInt(secondPerson[1]);
        char c = thirdPerson[0].charAt(0);
        int c1 = Integer.parseInt(thirdPerson[1]);

        int dec = 0;

        // 각 사람에 대해 조건 검사
        if (a == 'Y' && a1 >= 37) {
            dec += 1; 
        }
        if (b == 'Y' && b1 >= 37) {
            dec += 1; 
        }
        if (c == 'Y' && c1 >= 37) {
            dec += 1; 
        }

        // 위급상황 판단
        if (dec >= 2) {
            System.out.print("E");
        } else {
            System.out.print("N");
        }
    }
}