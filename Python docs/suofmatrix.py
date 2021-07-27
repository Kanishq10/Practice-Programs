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