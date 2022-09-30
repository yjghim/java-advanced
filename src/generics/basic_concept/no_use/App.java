package generics.basic_concept.no_use;

public class App {
    public static void main(String[] args) {
        String quote = null;
        Data data = new Data("Love life more than the meaning of it.");
        quote = (String) data.getObj();
        // Type casting is necessary. (Object to String)

        System.out.println(quote);
    }
}
