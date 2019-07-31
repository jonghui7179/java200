//다음 4개의 계산 문제 중 하나를 무작위로 출제하는 암산 훈련 프로그램을 작성하자. 이때 x, y, z에 3자리의 정숫값을 난수로 생성할 것.

import java.util.Random;
import java.util.Scanner;

class MentalArithmetic {
    static Scanner stdIn = new Scanner(System.in);

    static boolean confirmRetry(){
        int cont;
        do {
            System.out.print("다시 한번? <yes...1/No...2>:");
            cont = stdIn.nextInt();
        }while (cont!=1&&cont!=0);
        return cont == 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("암산 훈련!!");

        do{
            int x = rand.nextInt(900)+100; //3자리 수 생성
            int y = rand.nextInt(900)+100; //3자리 수 생성
            int z = rand.nextInt(900)+100; // 3자리 수 생성
            int pattern = rand.nextInt(4);

            int answer;

            switch (pattern){
                case 0 : answer = x + y + z; break;
                case 1 : answer = x + y - z; break;
                case 2 : answer = x - y + z; break;
                default: answer = x - y - z; break;
            }

            while (true){
                System.out.print(x+((pattern<2)?"+":"-")+y+((pattern%2==0)?"+":"-")+z+"=");
                int k = stdIn.nextInt();
                if (k == answer)
                    break;
                System.out.println("틀렸습니다.");
            }

        }while (confirmRetry());
    }


}