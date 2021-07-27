
import random
names = ["Nina", "Max", "Rose", "Jimmy"]
length = [len(name) for name in names]
print(length)

for name, leng in zip(names, length):
    print(f"{name} has a length of {leng} characters") if leng % 2 != 0 else print(end = "")




my_sum = sum([num for num in range(0, 100) if num % 3 == 0])
print(my_sum)

my_min = min([num for num in range(0, 100) if num % 3 == 0])
print(my_min)

my_max = max([num for num in range(0, 100) if num % 3 == 0])
print(my_max)