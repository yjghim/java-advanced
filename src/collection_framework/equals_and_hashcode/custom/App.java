package collection_framework.equals_and_hashcode.custom;

public class App {
    public static void main(String[] args) {
        Code code1 = new Code("S01", "L03");
        Code code2 = new Code("S01", "L03");

        System.out.println(code1.hashCode()+" "+code2.hashCode());
        System.out.println(code1.equals(code2)); // false
        // We have to override the equals() methods for customizing!
        // In fact, equals() method is already overrided in String class.

        Code code3 = new Code("S01", "L02");
        Code code4 = new Code("S01", "L03");

        System.out.println(code3.equals(code4));
        System.out.println(code3.hashCode()+" "+code4.hashCode());
    }
}
