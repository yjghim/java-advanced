package autoboxing_and_unboxing;

import java.util.ArrayList;

class IntWrapper {
    public int intValue;

    public IntWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> studentNumbers = new ArrayList<>();
        studentNumbers.add(201513257);
        // auto-boxing
        System.out.println(studentNumbers.get(0));
        // auto-unboxing

        ArrayList<IntWrapper> years = new ArrayList<>();
        years.add(new IntWrapper(1996));
        // auto-boxing is not working.
        System.out.println(years.get(0).getIntValue());
        // auto-unboxing is not working.

        ArrayList<Double> visions = new ArrayList<>();
        visions.add(1.5);
        // auto-boxing
        System.out.println(visions.get(0));
        // auto-unboxing
    }
}
