def f(n):
    return n if n<3 else n*f(n-2)
print(f(int(input())))