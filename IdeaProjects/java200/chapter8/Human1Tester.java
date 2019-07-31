class Human1 {
    private String name;
    private int height;
    private int weight;

    Human1(String n, int h, int w){
        name = n; height=h; weight=w;
    }

    String getName() {return name;}
    int getHeight() {return height;}
    int getWeight() {return weight;}

    void gainWeight(int w){weight+=w;}
    void reduceWeight(int w){weight-=w;}
}

class Human1Tester {
    public static void main(String[] args) {
        Human1 gildong = new Human1("길동", 170, 60);
        Human1 chulsu = new Human1("철수", 166, 72);

        gildong.gainWeight(3);
        chulsu.reduceWeight(5);

        System.out.println("이름:"+gildong.getName());
        System.out.println("신장:"+gildong.getHeight());
        System.out.println("체중:"+gildong.getWeight());
        System.out.println();

        System.out.println("이름:"+chulsu.getName());
        System.out.println("신장:"+chulsu.getHeight());
        System.out.println("체중:"+chulsu.getWeight());

    }
}