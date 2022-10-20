package collection_framework.list.stack;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Stack<Integer> years = new Stack<>();

        years.push(2012);
        years.push(2013);
        years.push(2014);
        years.push(2015);
        years.push(2016);
        // push
        years.pop();
        // pop: 2016

        // System.out.println(years.peek());
        // peak: 2015

        /*
        for(Integer year : years) {
            System.out.println(year);
        }
        */

        // check whether the stack is empty or not
        if(years.isEmpty())
            System.out.println("Stack is empty!");
        else
            System.out.println("Stack is not empty!");

        System.out.println(years.search(2014)); // 2
        System.out.println(years.search(1996)); // -1
    }
}