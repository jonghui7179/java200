import java.util.Scanner;

class MathMethods {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("실수값:");
        double x = stdIn.nextDouble();

        System.out.println("절댓값:"+Math.abs(x));
        System.out.println("제곱근:"+Math.sqrt(x));
        System.out.println("면적:"+Math.PI*x*x);

    }
}