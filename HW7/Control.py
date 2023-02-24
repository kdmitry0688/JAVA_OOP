from View.View import *
from Calculator.Types.Rational import Rational
from Calculator.Types.Complex import Complex


def Start():
    while True:
        type_choice = input(f"{choice_type_values} > ")
        if type_choice == "1":
            num1 = Rational("Первое число")
            num2 = Rational("Второе число")
        elif type_choice == "2":
            num1 = Complex("Первое число")
            num2 = Complex("Второе число")
        else:
            return 0

        type_operation = input(f"{choice_operation} > ")
        if type_operation == "1":
            num1.summarize(num2)
        elif type_operation == "2":
            num1.subtraction(num2)
        elif type_operation == "3":
            num1.multiplication(num2)
        elif type_operation == "4":
            num1.division(num2)
        elif type_operation == "5":
            continue
        else:
            "Неверное значение. Программа прекращает работать"
            return 0

        show_result(num1)