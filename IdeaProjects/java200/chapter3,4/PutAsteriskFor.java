//읽은 개수만큼 * 표시

import java.util.Scanner;

class PutAsteriskFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("몇 개의 *를 출력할까요?");
        int n = stdIn.nextInt();
        if (n>0){
            for(int i = 0; i<n ; i++)
                System.out.print('*');
            System.out.println();
        }
    }
}