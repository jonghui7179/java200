//정수 x를 오른쪽으로 n비트 회전한 값을 반환하는 rRotate 메서드와 왼쪽으로 n비트 회전한 값을 반환하는 메서드를 작성해보자.
//회전이란, 최하위 비트와 최상위 비트가 연결돼 있다고 간주하는 것이다. 예를 들어 오른쪽으로 5비트 회전한 경우, 시프트에 방출된 하위 5비트를 상위 비트로 다시 가져온다.

//정수를 좌우로 회전한 비트를 표시

import java.util.Scanner;

class Rotate {
    //--- int형 비트 구성 ---//
    static void printBits(int x){
        for (int i = 31 ; i>=0 ; i--)
            System.out.print(((x>>>i&1)==1)?'1':'0');
    }

    //---x를 오른쪽으로 n비트 회전한 값을 반환---//

    static int rRotate(int x, int n){
        if(n<0) return lRotate(x, -n);
        n %=32;
        return (n==0? x:())
    }
}