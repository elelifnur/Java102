package ENUM;

public enum Day {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESİ(6),
    PAZAR(7);
    private int day;

    private Day(int day){
        this.day=day;
    }

    public int getDay(){
        return this.day;
    }

    public void getDayName(){
        String day = null;
        switch (this.day){
            case 1:
                day = "PAZARTESİ";
                break;
            case 2:
                day = "SALI";
                break;
        }
        System.out.println(day);
    }

}
