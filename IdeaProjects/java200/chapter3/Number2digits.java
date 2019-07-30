//숫자 맞추기 게임

import java.util.Random;
import java.util.Scanner;

class Number2digits {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        int no = 10 + rand.nextInt(90);
        System.out.println("숫자맞추기게임시작!");
        System.out.println("10부터 99까지의 숫자를 맞추세요");

        int x;
        do {
            System.out.print("어떤 숫자 일까요?");
            x = stdIn.nextInt();

            if(x>no)
                System.out.println("더 작은 숫자입니다.");
            else if(x<no)
                System.out.println("더 큰 숫자입니다.");
        }while (x!=no);
        System.out.println("정답입니다.");
    }
}