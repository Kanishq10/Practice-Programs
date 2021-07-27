def sum(a,b,c=0,d=0,e=0,f=0,g=0,h=0,i=0):
    print(a+b+c+d)

print(sum(3,4,7,5,6))

datascientist={'python','r','Sql','git'}
i=0
while i<len(datascientist):
    print(sorted(datascientist)[i])
    i+=1
    
print(sorted(datascientist,reverse=True))

a=[]
n= int(input("Enter the number of elements in list:"))
for x in range(0,n):
    element=input("Enter element" + str(x+1) + ":")
    a.append(element)
max1=len(a[0])
temp=a[0]
for i in a:
    if(len(i)>max1):
       max1=len(i)
       temp=i
print("The word with the longest length is:")
print(temp)

x = int (input ())
y = int (input ())

a, sum = [], 0

for i in range (x):
    a.append([])
    for j in range (y):
        a[i].append(int (input ()))

    print (end="\n")

for i in range (x):
    for j in range (y):
        sum = sum + a[i][j]

    print (" Sum of", i, " row:", sum)
    sum = 0

print (end="\n")
sum = 0


for j in range (y):
    for i in range (x):
        sum = sum + a[i][j]

    print ("Sum of", j, " column:", sum)
    sum = 0