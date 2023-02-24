package Task1;

public class Gen<Tity> {
    Tity ob;// объявить объект типа Т

    Gen(Tity o) { // передать конструктору объект типа Т
        ob = o;
    }

    Tity getOb() {                         // вернуть объект ob из метода
        return ob;
    }

    void showType() {                   // отобразить тип Т
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;               // создаем  ссылку на объект типа Integer
        iob = new Gen<Integer>(88); // создание экземпляра типа Integer

        iob.showType();                 // отобразить тип данных iob

        int v = iob.getOb();            // присвоили примитиву значение обьекта iob
        System.out.println("Згачение: " + v);

        System.out.println();

        Gen<String> str = new Gen<String>("TestMessage");
        str.showType();                 // отобразить тип данных iob
        String str1 = str.getOb();      // присвоили str1 значение обьекта iob
        System.out.println("Згачение: " + str1);


    }
}