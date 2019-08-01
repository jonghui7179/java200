class Human {
    private String name; //이름
    private int height; //신장
    private int weight; //체중

    Human(String n, int h, int w){
        name=n; height=h; weight=w;
    }
    String getName(){return name;}
    int getHeight(){return height;}
    int getWeight(){return weight;}

    void gainWeight(int w){weight+=w;}
    void reduceWeight(int w){weight-=w;}
}