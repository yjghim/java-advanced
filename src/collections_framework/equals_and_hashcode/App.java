package collections_framework.equals_and_hashcode;

// Whenever We try to compare two objects, hash codes are getting compared.

public class App {
    public static void main(String[] args) {
        String name1 = "Ghim";
        String name2 = "Ghim";
//        System.out.println(name1 == name2); // true

        String name3 = new String("Ghim");
        String name4 = new String("Ghim");
//        System.out.println(name3 == name4); // false

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name3.hashCode());
        System.out.println(name4.hashCode());

        /*
        hashCode() method is available to each and every object.
        Hash code is a unique number for the object. (identifier of the object)
         */
    }
}
