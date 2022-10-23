package java_api.lang;

public class WrapperClass {
    public static void main(String[] args) {
        // equals()
        Integer num1 = 10;
        Integer num2 = 10;
        System.out.println(num1 == num2); // false
        System.out.println(num1.equals(num2)); // true
    }
}
