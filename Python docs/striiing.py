
a = "Welcome to coding"
new_string =""
data = "AEIOUaeiou"
for i in a:
    if i in data:
        pass
    else:
        new_string += i
print(new_string)

a="welcome to string"
vowel=['a','e','i','o','u','A','E','I','O','U']
new=""
for i in a:
    
    if i not in vowel:
        new+=i
a=new
print(a)

s="welcome to coding"
x="AEIOU"
n=""
for i in s:
    if i.upper() not in x:
        n=n+i
        s=n
print(s)