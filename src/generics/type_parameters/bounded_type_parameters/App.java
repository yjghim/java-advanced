package generics.type_parameters.bounded_type_parameters;

public class App {
    public static void main(String[] args) {
        Data<Integer, String> data = new Data<>(1, "Ghim");
        data.display('A', 2015);
        data.display('B', 1.5);
        data.display('C', 2.5f);
    }
}