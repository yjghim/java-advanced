package generics.type_parameters;



public class App {
    public static void main(String[] args) {
        Data<Integer, String> data = new Data<Integer, String>(1, "Ghim");

        System.out.println(data.toString());

        data.display(1996, "Ghim");
        data.display("Ghim", 1996);
    }
}