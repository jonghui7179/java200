public class Pet {
    private String name;
    private String mastername;

    public Pet(String name, String mastername){
        this.name=name;
        this.mastername=mastername;

    }

    public String getName(){return name;}

    public String getMastername(){return mastername;}


    public void introduce(){
        System.out.println("나의 이름은 "+name+"입니다.");
        System.out.println("주인님의 이름은 "+mastername+"입니다.");
    }
}