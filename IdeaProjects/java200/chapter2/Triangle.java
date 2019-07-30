//삼각형의 넓이를 구해서 표시

import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("삼각형의 넓이를 구합니다.");
        System.out.println("밑변:");
        double width = stdIn.nextDouble();
        System.out.println("높이: ");
        double high = stdIn.nextDouble();
        System.out.println("넓이는" + (width*high/2) + "입니다. ");

    }
}