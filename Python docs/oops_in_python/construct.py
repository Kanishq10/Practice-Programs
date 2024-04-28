class Person:
    name=""
    occ=""

    def __init__(self,n="",o=""):
        self.name=n
        self.occ=o

    def info(self):
        print(f"{self.name} is  a {self.occ}")
    

a=Person("Kanishq","Developer")
b=Person("Divya","HR")
c=Person()
a.info()
b.info()
c.info()