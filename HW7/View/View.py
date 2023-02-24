def show_result(num):
    try:
        print(f"Результат вычисления:  > {num.get_values()}")
    except Exception as err:
        print("Введено неверное значение")
        print(err)


choice_operation = """
Choice operation:
\t1. Сумма
\t2. Разница
\t3. Умножение
\t4. Деление
\t5. Возврат
"""

choice_type_values = """
Выберите тип значений:
\t1. Рациональные числа
\t2. Комплексные числа
\t3. Выход
"""