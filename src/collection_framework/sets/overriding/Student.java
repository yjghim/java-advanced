package collection_framework.sets.overriding;

import java.util.Objects;

public class Student {
    private String name;
    private String origin;

    public Student(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student temp = (Student) obj;
            return name.equals(temp.name) && origin.equals(temp.origin);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (name+origin).hashCode();
    }
}
