package generics.comparable_interface;

public class App {
    public static void main(String[] args) {
        Data<Integer> data = new Data<>(2015);
        System.out.println(data.compareTo(2015));
    }
}
