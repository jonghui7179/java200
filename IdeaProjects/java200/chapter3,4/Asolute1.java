import java.util.Scanner;

class Asolute1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값");
        int n = stdIn.nextInt();

        if (n>=0)
            System.out.println("절대값은 "+n+"입니다.");
        else
            System.out.println("절대값은 "+ -n + "입니다.");
    }
}