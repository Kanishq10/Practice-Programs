class Person:
    name = "Harry"
    occupation= "Software Developer"
    networth= 10
    def info(self):
        print(f"{self.name} is a {self.occupation}")

a=Person()
a.name="Kanishq"
print(a.name)
a.occupation="Bussinessman"
print(a.name, a.occupation)

b=Person()
b.name="Nikita"
b.occupation="HR"
b.info()
a.info()

