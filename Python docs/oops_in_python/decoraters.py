#decorator , just a syntatic sugar, for decoration purpose, take a function as input
def greet(fx):
    def mfx(*args, **kwargs):
        print("Good Morning")
        fx(*args,**kwargs)
        print("Thanks for using function")
    return mfx

@greet              
def hello():
    print("Hello World")      # same as greet(hello)()

@greet
def add(a,b):
    print(a+b)

hello()
add(10,23)

#practicle use , for logging ,debugging