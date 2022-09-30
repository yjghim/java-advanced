package generics.basic_concept.use;

public class App {
    public static void main(String[] args) {
        String name = null;
        GenericClass<String> genericData = new GenericClass<String>("Ghim");
        // Here we are specifying the type of object.
        name = genericData.getData();
        // Type casting is not necessary.

        System.out.println(name);

        /*
        Advantages of using generic

        1. We can reduce or eliminate type casting.
        2. Type safety: We can prevent the compile error from mismatching types.
         */
    }
}
