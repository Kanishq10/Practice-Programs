li=[1,4,7.6,"lyy"]
print(type(li))
li[2]=7.55
li[3]="lie"
print(li)
print(li[1:3])
print(li[1:])
print(li[:])
print(li[:-2])
print(li[2:])
li.append("hi")
li.extend(["how","are","you"])
print(li)
li.insert(3,4)
print(li)
li.remove(4)
print(li)
li.pop()
print(li)
li.pop(3)
print(li)
a=[1,2,"df",4.5,22]
print(a[1:3])
for el in range(len(a)):
    print(a[el],end=" ")
for el in a[1:]:
    print(el,end=" ")
print("",end="\n")
print(a)