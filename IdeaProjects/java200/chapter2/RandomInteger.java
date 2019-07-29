//정수의 난수를 생성해서 표시
//프로그램의 첫 부분에 둔다

import java.util.Random;
class RandomInteger {
    public static void main(String[] args) {
        //메소드의 첫 부분에 둔다.
        Random rand = new Random();

        //난수를 생선한다.
        int n1 = 1 + rand.nextInt(9);
        int n2 = -1 - rand.nextInt(9);
        int n3 = 10 + rand.nextInt(90);

        System.out.println("3개의 난수를 생성했습니다.");
        System.out.println("한 자리 양의 정수:"+n1);
        System.out.println("한 자리 음의 정수:"+n2);
        System.out.println("두 자리 양의 정수:"+n3);
    }
}