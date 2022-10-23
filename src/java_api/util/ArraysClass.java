package java_api.util;

import java.util.Arrays;

public class ArraysClass {
    public static void showArray(int[] arr) {
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // binarySearch()
        int[] arr = new int[1000];
        for(int i=0; i<arr.length; i++)
            arr[i] = i;
        System.out.println(Arrays.binarySearch(arr, 999));

        // copyOf()
        int[] arr1 = {2014, 2015, 2016, 2017};

        int[] arr2 = Arrays.copyOf(arr1, 2);
        showArray(arr2);
        int[] arr3 = Arrays.copyOf(arr1, 10);
        showArray(arr3);

        // copyOfRange()
        int[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
        showArray(arr4); // 2015 2016

        // fill()
        int[] arr5 = new int[10];
        Arrays.fill(arr5, 1996);
        showArray(arr5);

        // sort()
        int[] arr6 = {1592, 2002, 1996, 2015};
        Arrays.sort(arr6);
        showArray(arr6);
    }
}
