package generics.comparable_interface;

public class Data<T extends Comparable<T>> implements Comparable<T> {
    private T var;

    public Data(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }

    @Override
    public String toString() {
        return "Data{" +
                "var=" + var +
                '}';
    }

    @Override
    public int compareTo(T obj) {
        // return getVar().compareTo(obj);
        return obj.compareTo(getVar());
    }
}
