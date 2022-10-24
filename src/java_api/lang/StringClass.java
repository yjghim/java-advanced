package java_api.lang;

public class StringClass {
    public static void main(String[] args) {
        // length()
        String name = "Ghim";
        System.out.println(name.length());

        // charAt()
        String quote = "Love your life more than the meaning of it.";
        for(int i=0; i<quote.length(); i++)
            System.out.print(quote.charAt(i));
        System.out.println();

        // concat()
        String str1 = "An-nyeong";
        String str2 = " haseyo!";
        System.out.println(str1.concat(str2));
        System.out.println(str1);
        System.out.println(str2);

        // indexOf()
        String nation = "South Korea";
        System.out.println(nation.indexOf('s')); // -1
        System.out.println(nation.indexOf("Korea")); // 6

        // trim() : It removes all blank characters in the beginning and end of that string.
        String str3 = "   Java   ";
        System.out.println(str3 + " Study");
        System.out.println(str3.trim() + " Study");
        System.out.println(str3);

        // toLowerCase(), toUpperCase()
        String lang = "C, Java, Python";
        System.out.println(lang.toLowerCase());
        System.out.println(lang.toUpperCase());
        System.out.println(lang);

        // split()
        name = "Young-june Ghim";

        String[] arr = name.split(" ");
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);

        arr = name.split("");
        for(int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}
