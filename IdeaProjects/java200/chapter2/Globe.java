//구의 부피와 겉넓이 구하기(원주율 3.1416은 final 변수를 사용)

import java.util.Scanner;

class Globe {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        final double PI = 3.1416; //final  변수는 대문자로 쓴느게 원칙

        System.out.println("구의 겉넓이와 부피를 구합니다.");
        System.out.print("반지름: ");
        double r = stdIn.nextDouble();

        System.out.println("겉넓이는 "+(4*PI*r*r)+"입니다.");
        System.out.println("부피는 "+(4/3.0*PI*r*r*r)+"입니다.");

    }
}