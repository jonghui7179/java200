//입력한 2개의 실숫값의 합과 평균을 표시
import java.util.Scanner;
class SumAveDouble {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("x값: ");
        double x = stdIn.nextDouble();
        System.out.println("y값: ");
        double y = stdIn.nextDouble();
        System.out.println("합계는"+(x+y)+"입니다.");
        System.out.println("평균은"+(x+y)/2+"입니다. ");
    }
}