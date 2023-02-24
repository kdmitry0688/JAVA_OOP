package Seminar2.Task3;

public class IfDemo {
    public static void main(String[] args) {
        MyIfImpl my = new MyIfImpl();
        System.out.println("Идентификатор пользователя: " + my.getUserID());
        System.out.println("Идентификатор администратора" + my.getAdminID());

        int id = MyIF.getUniversalID();
        System.out.println("Универсальный идентификатор: " + id);
        System.out.println("УД2:  " + MyIF.getUniversalID());
    }
}
