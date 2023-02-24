package Seminar2.Task1;

public class Test2 implements Program{
    int start;
    int val;

    @Override
    public int getNext() {
        val+=3;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }
}
