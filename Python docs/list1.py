my_list = [num for num in range(0, 100) if num % 2 == 0]
print(my_list)


my_list = [num for num in range(0, 100) if num % 3==0 and num % 5 == 0]
print(my_list)

my_list = [num for num in range(100,-1,-1)]
print(my_list)

my_list = [num for num in range(0, 100)]
my_slice = my_list[: :-1]
print(my_slice)

import random
names = ["Nina", "Max", "Floyd", "Lloyd"]
scores = [random.randint(0, 100) for name in names]
print(scores)

for name, score in zip(names, scores):
    print(f"{name} got a score of {score}")
    names = ["Nina", "Max", "Rose", "Jimmy"]

import random
names = ["Nina", "Max", "Floyd", "Lloyd"]
length = [len(name) for name in names]
print(scores)

for name, length in zip(names, length):
    print(f"{name} got a score of {length}")
names = ["Nina", "Max", "Rose", "Jimmy"]

#list if tuples
names = ["Nina", "Max", "Rose", "Jimmy"]
my_list = [("length", len(name) * 2) for name in names]
print(my_list)

names = ["Nina", "Max", "Rose", "Jimmy"]
my_list = [name for name in names if len(name)%2!=0]
print(my_list)

