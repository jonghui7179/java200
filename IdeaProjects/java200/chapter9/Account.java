class Account {
    private String name; //계좌 명의
    private String no; //계좌 번호
    private long balance; //예금 잔고
    private Day openDay; //같은 디렉터리에 있는 데이클래스 소환


    public Account(String n, String num, long z, Day d){
        name = n;
        no = num;
        balance = z;
        openDay = new Day(d);

    }

    public String getName(){return name;}
    public String getNo(){return no;}
    public long getBalance(){return balance;}

    public Day getOpenDay() {
        return new Day(openDay);
    }

    void deposit(long k){
        balance += k;
    }

    void withdraw(long k){
        balance -=k;

    }


    public String toString(){
        return "["+name+", "+no+", "+balance+"]";
    }
}