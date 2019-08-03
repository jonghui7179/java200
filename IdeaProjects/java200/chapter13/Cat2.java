class Cat2 extends Animal2 {
    private int age;
    public Cat2(String name, int age){
        super(name); this.age = age;
    }

    public void bark(){
        System.out.println("냐용");
    }
    public String toString(){
        return age + "의 "+getName();
    }
}