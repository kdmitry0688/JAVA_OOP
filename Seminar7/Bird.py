class Bird():
    def __init__(self):
        print("Птица готова")

    def Who (self):
        print("Птица")

    def fly(self):
        print("Летает быстрее")


class Peng(Bird):

    def __init__(self):
        super().__init__()
        print("Пингвин готов")

    def Who(self):
        print("Пингвин")

    def run(self):
        print("Быстрее бегает")


ping = Peng()
ping.Who()
ping.fly()
ping.run()