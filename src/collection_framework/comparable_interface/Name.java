package collection_framework.comparable_interface;

public class Name implements Comparable<Name> {
    private String name = null;

    public Name(String name) {
        this.name = name;
    }

    /*
    We can customize the logic of compareTo method by overriding.
    In this case, we hope to compare the two objects by their length.
     */

    @Override
    public int compareTo(Name obj) {
        if(name.length() == obj.name.length())
            return 0;
        else if(name.length() == obj.name.length())
            return -1;
        else
            return 1;
    }

    //  We can customize the logic of toString method by overriding.
    @Override
    public String toString() {
        return name;
    }
}
