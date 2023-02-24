class Rational:
    def __init__(self, msg=""):
        print(msg)
        self.values = float(input("Введите значение: "))
        print()

    def summarize(self, other):
        if type(other) == Rational:
            self.values += other.values

    def subtraction(self, other):
        if type(other) == Rational:
            self.values -= other.values

    def multiplication(self, other):
        if type(other) == Rational:
            self.values *= other.values

    def division(self, other):
        if type(other) == Rational:
            self.values /= other.values

    def get_values(self):
        return self.values