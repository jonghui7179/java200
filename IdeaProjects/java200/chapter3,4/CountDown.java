//양의 정숫값을 0까지 카운트다운

import java.util.Scanner;

class CountDown {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("카운트 다운합니다.");

        int x;

        do {
            System.out.print("양의 정숫값:");
            x = stdIn.nextInt();
        }while (x<=0);

        while (x>=0)
            System.out.println(x--);
        System.out.println("x의값이"+x+"이 됐습니다.");
    }
}