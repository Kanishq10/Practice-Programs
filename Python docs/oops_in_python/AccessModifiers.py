#There are no access mmodifiers in python
#But we use some conventions python

class Employee:
    def __init__(self):
        self.__name= "Harry"   #use __ before variable to make it private
        self._age=12

    def _funName(self):   #Protected by convention , we can make different convention
        return "I am protected yay"
    
class Developer(Employee): #inherited
    pass




a=Employee()
# print(a.__name)  cannot  be accesed  directly
print(a._Employee__name) #can be accessed indirectly,  
#it is saved as different name in class so that  it can not   be accidently  overrider,  it is   called name  mangling
print(a.__dir__())

b=Developer()
print(b._age)
print(b._funName())