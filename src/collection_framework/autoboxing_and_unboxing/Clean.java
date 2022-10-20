package collection_framework.autoboxing_and_unboxing;

import java.util.ArrayList;

public class Clean {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(25);
        System.out.println(ages.get(0));

        ArrayList<Float> heights = new ArrayList<>();
        heights.add(173.5f);
        System.out.println(heights.get(0));
    }
}
