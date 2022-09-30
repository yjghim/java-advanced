package generics.basic_concept.use;

// 'T' means type.
public class GenericClass<T> {
    private T data = null;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "data=" + data +
                '}';
    }
}