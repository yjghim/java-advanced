package java_api.lang;

public class StringBufferClass {
    public static void main(String[] args) {
        // append()
        StringBuffer str1 = new StringBuffer("South");
        StringBuffer str2 = new StringBuffer(" Korea");
        System.out.println(str1.append(str2)); // South Korea
        System.out.println(str1); // South Korea

        // capacity() : It returns current buffer size of the instance.
        StringBuffer str3 = new StringBuffer();
        StringBuffer str4 = new StringBuffer("Java");
        System.out.println(str3.capacity()); // default size of buffer : 16
        System.out.println(str4.capacity()); // 16 + 4 = 20

        // delete()
        StringBuffer str5 = new StringBuffer("Football");
        str5.delete(0, 4);
        System.out.println(str5);
        // deleteCharAt()
        str5.deleteCharAt(0);
        System.out.println(str5);

        // insert()
        StringBuffer str6 = new StringBuffer("I like Python");
        str6.insert(1, " don't");
        System.out.println(str6);
    }
}
