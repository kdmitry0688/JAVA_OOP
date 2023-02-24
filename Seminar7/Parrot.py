class Parrot():
    # Атрибут класса
    spec = "Птица"

    # инициализация конструктора
    def __init__(self, name, age):
        self.name = name
        self.age = age

# создаем экземпляры класса
Kesha = Parrot("Кеша", 10)
Zhorik = Parrot("Жорик", 15)

#Получаем доступ к атрибутам
print(f'Кеша - {Kesha.__class__.spec}')
print(f'Жорик - {Zhorik.__class__.spec}')

#Получаем доступ к эдементам экземпляра
print(f'Мой попугай {Kesha.name}, ему {Kesha.age} лет')


