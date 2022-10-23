package java_api.lang;

public class MathClass {
    public static void main(String[] args) {
        // random() : 0.0 <= x < 1.0 (double type)
        System.out.println((int)(Math.random() * 100)); // 0 ~ 99
        System.out.println((int)(Math.random() * 6)); // 0 ~ 5
        System.out.println((int)(Math.random() * 6) + 1); // 1 ~ 6
        System.out.println((int)(Math.random() * 6) + 3); // 3 ~ 8

        // abs()
        System.out.println(Math.abs(-100));

        // ceil(), floor(), round()
        System.out.println(Math.ceil(10.0)); // 10.0
        System.out.println(Math.ceil(10.1)); // 11.0
        System.out.println(Math.ceil(10.000001)); // 11.0

        System.out.println(Math.floor(10.0)); // 10.0
        System.out.println(Math.floor(10.9)); // 10.0

        System.out.println(Math.round(10.0)); // 10
        System.out.println(Math.round(10.4)); // 10
        System.out.println(Math.round(10.5)); // 11

        // max(), min() : It compares number.
        System.out.println(Math.max(3.14, 3.1400001));
        System.out.println(Math.min(3.14, 3.1400001));

        // pow(), sqrt()
        System.out.println(Math.pow(2, 5)); // 32 (double type)
        System.out.println(Math.sqrt(16)); // 4 (double type)
    }
}
