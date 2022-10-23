package java_api.lang;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        String info = this.id + " " + this.name;
        return info;
    }
}
