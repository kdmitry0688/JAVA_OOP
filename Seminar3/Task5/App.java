package Seminar3.Task5;

import java.util.function.BinaryOperator;

public class App {
    public static void main(String[] args) {
        BinaryOperator<Integer> ob = (x,y) -> x*y;
        System.out.println(ob.apply(2,3));
        System.out.println(ob.apply(12,11));
        System.out.println(ob.apply(11,111));
    }
}
