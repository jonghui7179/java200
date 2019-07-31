import java.util.Scanner;

class Grade2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("점수: ");
        int point = stdIn.nextInt();

        if(point<0||point>100)
            System.out.println("점수를 잘못 입력했습니다.");
        else if (point>=80)
            System.out.println("우");
        else if (point>=70)
            System.out.println("수");
        else if (point>=60)
            System.out.println("미");
        else if (point>=50)
            System.out.println("양");
        else
            System.out.println("가");
    }
}