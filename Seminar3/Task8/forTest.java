package Seminar3.Task8;

public class forTest {
    public static void main(String[] args) {
        Consumer<Integer> print = x -> System.out.printf("%d Долларов \n", x);
        print.accept(600);

    }
}
