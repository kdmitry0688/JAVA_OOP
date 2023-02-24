package Seminar4.Task4;

public interface Contain<T> {
    boolean contains(T o);
}

class Gen4<T> implements Contain<T> {
    T[] arr;        // если интерфейс обобщен, то и лкасс должен быть обобщен

    Gen4(T[] o) {
        arr = o;
    }

    @Override
    public boolean contains(T o) { // реализован метод интерфейса для проверки вхождения элемента в массив
        for (T x : arr) {
            if (x.equals(o)) {
                return true;
            }
        }
        return false;
    }
}

class Gen5 {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3};        // не моржем использовать примитив при обобщении (нельзя использовтаь int)

        Gen4<Integer> ob = new Gen4<>(x);
        if (ob.contains(2)) {
            System.out.println("2 содержится в ob");
        } else {
            System.out.println("2 не содержится в ob");
        }
        if (ob.contains(5)) {
            System.out.println("5 содержится в ob");
        } else {
            System.out.println("5 не содержится в ob");
        }


    }
}

class Gen6 {
    public static void main(String[] args) {
        String[] y = {"q", "w", "e"};        // не моржем использовать примитив при обобщении (нельзя использовтаь int)

        Gen4<String> ob = new Gen4<>(y);
        if (ob.contains("q")) {
            System.out.println("q содержится в ob");
        } else {
            System.out.println("q не содержится в ob");
        }
        if (ob.contains("t")) {
            System.out.println("t содержится в ob");
        } else {
            System.out.println("t не содержится в ob");
        }


    }
}