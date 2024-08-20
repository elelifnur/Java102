package ENUM;

public class Gun {
    public static final Gun PAZARTESİ = new Gun(1);
    public static final Gun SALI = new Gun(2);
    public static final Gun ÇARŞAMBA = new Gun(3);
    public static final Gun PERŞEMBE = new Gun(4);
    public static final Gun CUMA = new Gun(5);
    public static final Gun CUMARTESİ = new Gun(6);
    public static final Gun PAZAR = new Gun(7);
    private int day;

    private Gun(int day){
        this.day= day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
