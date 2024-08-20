package CollectionAndMapInterface.TreeSet;

public class Student {
    private int no;
    private String name;
    private int note;

    public Student(int no, String adi, int note) {
        this.no = no;
        this.name = adi;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
}
