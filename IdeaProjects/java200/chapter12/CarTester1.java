class CarTester1 {
    public static void main(String[] args) {
        Car car1 = new Car("w1240", 1885, 1490, 5220, 95.0, new Day(2018, 10, 13));

        ExCar car2 = new ExCar("w221", 1845, 1490, 5205, 90.0, new Day(2015, 12, 24));

        Car x;
        x = car1;
        x = car2;

        System.out.println("x구입일:"+x.getPurchaseDay());

        ExCar y;
        //상위 클래스형의 인스턴스는 참조할 수 없다. 왜? 값이 없거든 = car1
        y = car2;

        System.out.println("구입일:"+y.getPurchaseDay());
        System.out.println("y의 총 주행 거리:"+y.getTotalMileage());
    }
}