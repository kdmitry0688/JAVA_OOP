class Comp():

    def __init__(self):
        self.__max_price = 900

    def sell (self): # Setter
        print(f'Цена продажи - {self.__max_price}')

    def set_max(self,price):
        self.__max_price = price

    # def get_max(self):
    #     return self.__max_price


comp = Comp()
comp.sell()

# Цена не изменяется при обращении к полю
comp.__max_price = 1000
comp.sell()

# Цена изменяется при обращении к Setter
comp.set_max(2000)
comp.sell()

