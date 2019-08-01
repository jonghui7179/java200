import java.util.Scanner;

class CoordinateTester1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요.");
        System.out.print("x좌표:"); double x = stdIn.nextDouble();
        System.out.print("y좌표:"); double y = stdIn.nextDouble();

        Coordinate p = new Coordinate(x, y);
        System.out.println("p=("+p.getX()+","+p.getY()+")");

        Coordinate q = p ;
        q.set(9.9, 9.9);

        System.out.println("p=("+p.getX()+", "+p.getY()+")");
        System.out.println("q=("+q.getX()+", "+q.getY()+")");


    }
}
//Coordinate형의 변수 q를 선언한다. p는 인스턴스를 참조하는 것이므로, p의 인스턴스를 참조하도록
//q가 초기화 된다. 그 결과 p와 q의 조정 대상이 되는 인스턴스는 동일 인스턴스가 된다. 생성자가 호출되지 않으며,
//좌표용 인스턴스가 새롭게 생성되는 것도 아니다. set 메서드를 호출해서 q의 좌표를 (9.9, 9.9)로 변경한다.
//q의 참조대상 인스턴스에 값을 설정하는 것은 p용으로 만들어진 인스턴스값을 변경하는 것과 같다. 그 결과 값을
//설정하지 않은 p의 좌표도 함께 (9.9, 9.9)로 변경된다.