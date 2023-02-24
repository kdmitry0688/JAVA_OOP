package Presenter;

import Console.View;
import Model.CalcModel;
import Model.SumCalc;

public class Presenter {

    CalcModel model;
    View view;

    public Presenter(CalcModel m, View v) {
        this.model = m;
        this.view = v;

    }

    public void buttonClick() {
        double x = view.getValue("Введите число 1: ");
        double y = view.getValue("Введите число 2: ");

        model.setX(x);
        model.setY(y);
        double res = model.result();
        view.show(res, "Sum = ");
    }

}

class Test1 {
    public static void main(String[] args) {
        Presenter p = new Presenter(new SumCalc(), new View());
        p.buttonClick();
    }
}