package generics.type_parameters.bounded_type_parameters;

public class Data<K extends Integer, V> {
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    // Generic method
    public <E extends Character, N extends Number> void display(E element, N number) {
        // N extends Number: It gives a restriction.
        System.out.println(element);
        System.out.println(number);
    }
}