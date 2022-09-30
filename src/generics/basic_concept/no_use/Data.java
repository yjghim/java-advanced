package generics.basic_concept.no_use;

public class Data {
    private Object obj;
    // Object can contain any type of data.

    public Data(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Data{" +
                "obj=" + obj +
                '}';
    }
}
