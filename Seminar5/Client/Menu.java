package Client;

import Console.View;
import Model.CalcModel;
import Presenter.Presenter;

import java.util.Scanner;

public class Menu {
    Presenter pr;
    View v;
    CalcModel calc;

    public Menu(){
        pr = new Presenter(calc, v);

    }

    Scanner scanner = new Scanner(System.in);
    int value = scanner.nextInt();



}
