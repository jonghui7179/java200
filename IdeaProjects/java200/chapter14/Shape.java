public abstract class Shape {
    /**
     * 도형 정보를 나타내는 문자열을 반환하는 추상 메서드이다.
     * shape 클래스에서 파생되는 클래스에서 이 메서드를 구현한다.
     * 이 메서드는 java.lang.object 클래스의 메서드를 추상 메서드로
     * 오버라이드한 메서드이다.
     */

    public abstract String toString();


    /**
     * draw메서드는 도형을 그리기 위한 추상 메서드이다.
     * shape 클래스에서 파생되는 클래스에서 이 메서드를 구현한다.
     */

    public abstract void draw();

    /**
     * print 메서드는 도형 정보를 표시하고 도형 자체를 그린다.
     * 구체적으로는 다음 두 단계를 따른다.
     * step1 toString 메서드가 반환하는 문자열을 표시하고 줄 바꿈
     * step2. draw 메서드를 호출해서 도형을 그림
     */

    public void print(){
        System.out.println(toString());
        draw();
    }
}