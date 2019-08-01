class Human {
    private static int counter = 0;
    private String name; //이름
    private int height; //신장
    private int weight; //체중
    private int id; //식별 번호


    public Human(String n, int h, int w){
        this.name=n; this.height=h; this.weight=w;
        id = ++counter;
    }

    public String getName(){return name;}
    public int getHeight(){return height;}
    public int getWeight(){return weight;}

    public void gainWeight(int w){weight+=w;}
    public void reduceWeight(int w){weight-=w;}

    public int getId(){return id;}

    public void putData(){
        System.out.println("이름:"+name);
        System.out.println("신장:"+height+"cm");
        System.out.println("체중:"+weight+"kg");
    }
}