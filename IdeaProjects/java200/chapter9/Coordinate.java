/*문제점이 많은 ver.1

class Coordinate {
   private double x;
   private double y;

   Coordinate(double x, double y) {this.x=x; this.y=y;}

   double getX() {return x;}
   double getY() {return y;}

   void setX(double x){this.x=x;}
   void setY(double y){this.y=y;}

   void set(double x, double y){this.x=x; this.y=y;}

        } */

class Coordinate {
   private double x;
   private double y;

   //--생성자---//

   public Coordinate(){}
   public Coordinate(double x, double y){set(x, y);}
   public Coordinate(Coordinate c) {this(c.x, c.y);}
   /* 인수로 받은 좌표 c의 필드 c.x c.y의 값을 복사해서 좌표를 초기화한다. 이처럼 자신과 동일한
   클래스형의 인수를 받아서 모든 필드의 값을 복사하는 생성자를 복사 생성자라고 한다. 이 생성자 안의 this 형식은
   동일 클래스 내의 생성자를 호출한다. 두 좌표 값의 설정을 생성자2에 맡긴다.
    */


   public double getX(){return x;}
   public double getY(){return y;}

   public void setX(double x){this.x=x;}
   public void setY(double y){this.y=y;}

   public void set(double x, double y){this.x=x; this.y=y;}
   public boolean equalTo(Coordinate c){return x==c.x&&y==c.y;}
   public String toString() {return "("+x+", "+y+")";}

}

/* 문제점 해결
1. 버전1에서는 오류가 발생했을 코드가 2에서는 제대로 동작한다.
for(int i=0; i<a.length ; i++)
    a[i] = new Coordinate();  --> 일단 생성하는 게 가능해진다.
for(int i=0; i<a.length ; i++)
    a[i].set(5.5, 7.7)   ---> 나중에 값을 설정하는 게 가능해진다. 0.0 으로 초기화되어있기때문.
 */