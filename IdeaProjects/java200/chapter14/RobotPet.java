public class RobotPet extends Pet {
    public RobotPet(String name, String mastername){
        super(name, mastername);
    }

    public void introduce(){
        System.out.println("나는 로봇! 이름은"+getName()+".");
        System.out.println("주인님으 이름은"+getMastername()+".");
    }

    public void work(int sw){
        switch (sw){
            case 0:
                System.out.println("청소를 합니다.");break;
            case 1:
                System.out.println("세탁을 합니다."); break;
            case 2:
                System.out.println("밥을 합니다.");break;
        }
    }
}