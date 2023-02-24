package Seminar3.Task7;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {
        Function<Integer, String> ob = x -> String.valueOf(x) + "$";
        System.out.println(ob.apply(4));
    }
}
