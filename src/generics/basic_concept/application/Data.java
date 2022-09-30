package generics.basic_concept.application;

public class Data<T> {
    private T var = null;

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
}
