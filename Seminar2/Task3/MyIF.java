package Seminar2.Task3;

public interface MyIF {
    int getUserID();

    default int getAdminID() {
        return 1;
    }

    static int getUniversalID(){
        return 100500;
    }
}
