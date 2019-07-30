//주소를 읽어서 표시

import java.util.Scanner;

class Address {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("주소: ");
        String address = stdIn.nextLine(); //주소를 입력받아서 저장을 한다.
        System.out.print("주소는 "+address+"입니다.");
    }
}