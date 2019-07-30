//2개의 실수값을 읽어서 큰 쪽을 표시하는 방법2

import java.util.Scanner;

class Max2A {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a값:");
        double a = stdIn.nextDouble();

        System.out.print("b값:");
        double b = stdIn.nextDouble();

        double max = a>b?a:b;

        if (a==b)
            System.out.println("두 개의 값은 같습니다.");
        else
            System.out.println("큰 쪽의 값은"+max+"입니다.");
    }
}