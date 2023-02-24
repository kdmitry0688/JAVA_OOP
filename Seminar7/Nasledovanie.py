class Horse():
    is_Horse = True

class Donkey():
    is_Donkey = True


class Mule(Horse, Donkey):
    pass

# mule: Mule = Mule()

print(Mule.is_Horse)
print(Mule.is_Donkey)

