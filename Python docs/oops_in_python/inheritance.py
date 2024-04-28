class Employee:
    raise_amt=1.04

    def __init__(self,first, last, pay):
        self.first= first
        self.last=last
        self.email=first + '.' + last + '@email.com'
        self.pay=pay
    
    def fullname(self):
        return '{}{}'.format(self.first,self.last)
    
    def apply_raise(self):
        self.pay= int (self.pay*self.raise_amt)

class Developer(Employee):
    raise_amt=1.10
    def __init__(self,first, last, pay,prog_lang):
        super().__init__(first,last,pay)
        self.prog_lang=prog_lang

class Manager(Employee):
    def __init__(self,first, last, pay,employees=None):
        super().__init__(first,last,pay)
        if employees is None:
            self.employees=[]
        else:
            self.employees=employees

    def add_emp(self,emp):
        if emp not in self.employees:
            self.employees.append(emp)
    
    def remove_emp(self, emp):
        if emp in self.employees:
            self.employees.append(emp)

    def print_emps(self):
        for emp in self.employees:
            print('-->',emp.fullname())
        print('---------------------------------')

dev1=Developer('Corey','Schafer',50000,'Python')
dev2=Developer('Smith','Wilson',60000,'Java')

mgr_1=Manager('Sue','Hoo',90000,[dev1])
# print(help(Developer))
# print(dev1.prog_lang)
# print(dev1.pay)
# dev1.apply_raise()
# print(dev1.pay)
print(mgr_1.email)
# mgr_1.print_emps()
mgr_1.add_emp(dev2)
mgr_1.print_emps()

print(isinstance(mgr_1,Manager))
print(isinstance(mgr_1,Employee))
print(isinstance(mgr_1,Developer))

print(issubclass(Developer,Employee))
print(issubclass(Manager,Employee))
print(issubclass(Manager,Developer))
print(issubclass(Developer,Developer))