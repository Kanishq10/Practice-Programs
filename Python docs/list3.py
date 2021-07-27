print("Enter a list",end=" ")
arr=list(int(i) for i in input().strip().split(' '))
result=0
for num in arr:
    result+=num
print("sum of these numbers is",result)