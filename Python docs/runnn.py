nG = {}
nG[(1,2,4)] = 8
nG[(4,2,1)] = 10
nG[(1,2)] = 12
sum = 0
for k in nG:
   sum += nG[k]
print(len(nG)+ sum)

a = ('python',)
n = 2
for i in range(int(n)):
   a = (a,)
   print(a)


# my_tup=(1,2,3,4)
# my_tup.append((5,6,7))
# print(len(my_tup)

s={4>3, 0, 3-3}
print(all(s))
print(any(s))

s1={3, 4}
s2={1, 2}
s3=set()
i=0
j=0
for i in s1:
    for j in s2:
       s3.add((i,j))
       i+=1
       j+=1
print(s3)

dict1={"a":10,"b":2,"c":3}
str1=""
for i in dict1:
   str1=str1+str(dict1[i])+" "
   str2=str1[:-1]
print(str2[::-1])




dict1={"a":1,"b":2,"c":3}
print(len(dict1))
print(dict1.get("b"))
dict1["a"]=5


D = dict()  
for x in enumerate(range(2)):  
  D[x[0]] = x[1]  
  D[x[1]+7] = x[0]  
print(D)



dictionary1 = {'Google' : 1,   'Facebook' : 2,  'Microsoft' : 3}  

dictionary2 = {'GFG' : 1,   'Microsoft' : 2,  'Youtube' : 3}  
dictionary1.update(dictionary2);  
for key, values in dictionary1.items():  
    print(key, values , end=" ")

