package java_api.lang;

public class ObjectClass {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Ghim");
        Student student2 = new Student(2, "Wang");

        // toString()
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        // equals()
        System.out.println(student1.equals(student2));
    }
}
